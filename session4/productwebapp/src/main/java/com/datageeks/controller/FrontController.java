package com.datageeks.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.datageeks.dao.ProductBean;
import com.datageeks.service.ProductService;
import com.datageeks.service.ServicesException;

@WebServlet(urlPatterns = { "/search", "/delete", "/editPage", "/update","/addPage","/add" })

public class FrontController extends HttpServlet {
	ProductService productService = new ProductService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String reqPath = request.getServletPath();

		if (reqPath.endsWith("search")) {
			String productName = request.getParameter("productName");

			if (productName == null || productName.trim().length() == 0) {
				request.setAttribute("productNameReq", " please specify product name");
				request.getRequestDispatcher("/search.jsp").forward(request, response);

			} else {
				try {
					List<ProductBean> productList = productService.search(productName.trim());
					if (productList == null || productList.size() == 0) {
						request.setAttribute("invalidName", " Product Details not found with the given name");
						request.getRequestDispatcher("/search.jsp").forward(request, response);
					} else {
						request.setAttribute("productList", productList);
						request.getRequestDispatcher("/success.jsp").forward(request, response);
					}
				} catch (ServicesException e) {
					response.sendRedirect("./error.jsp");
				}
			}
		} else if (reqPath.endsWith("delete")) {
			Integer productId = Integer.valueOf(request.getParameter("productId"));
			try {
				productService.delete(productId);
				List<ProductBean> productList = productService.getAll();
				if (productList == null || productList.size() == 0) {
					request.setAttribute("noData", " No Products avialable");
					request.getRequestDispatcher("/search.jsp").forward(request, response);
				} else {
					request.setAttribute("productList", productList);
					request.getRequestDispatcher("/success.jsp").forward(request, response);
				}

			} catch (ServicesException e) {
				response.sendRedirect("./error.jsp");
			}
		} else if (reqPath.endsWith("editPage")) {
			Integer productId = Integer.valueOf(request.getParameter("productId"));
			try {
				ProductBean product = productService.get(productId);
				request.setAttribute("product", product);
				request.getRequestDispatcher("/edit.jsp").forward(request, response);

			} catch (ServicesException e) {
				response.sendRedirect("./error.jsp");
			}
		} else if (reqPath.endsWith("update")) {
			Integer productId = Integer.valueOf(request.getParameter("productId"));
			String productName = request.getParameter("productName");
			Float productPrice = Float.valueOf(request.getParameter("productPrice"));

			ProductBean product = new ProductBean(productId, productName, productPrice);

			try {
				productService.saveOrUpdate(product);
				List<ProductBean> productList = productService.getAll();
				request.setAttribute("productList", productList);
				request.getRequestDispatcher("/success.jsp").forward(request, response);

			} catch (ServicesException e) {
				response.sendRedirect("./error.jsp");
			}
		} else if (reqPath.endsWith("addPage")) {
			request.getRequestDispatcher("/add.jsp").forward(request, response);
		} else if (reqPath.endsWith("add")) {
			Integer productId = Integer.valueOf(request.getParameter("productId"));
			String productName = request.getParameter("productName");
			Float productPrice = Float.valueOf(request.getParameter("productPrice"));

			ProductBean product = new ProductBean(productId, productName, productPrice);

			try {
				ProductBean p = productService.get(productId);
				if (p == null) {
					productService.saveOrUpdate(product);
					List<ProductBean> productList = productService.getAll();
					request.setAttribute("productList", productList);
					request.getRequestDispatcher("/success.jsp").forward(request, response);
				} else {
					request.setAttribute("idExits", "Product Id already exists");
					request.setAttribute("product", product);
					request.getRequestDispatcher("/add.jsp").forward(request, response);
				}

			} catch (ServicesException e) {
				response.sendRedirect("./error.jsp");
			}
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}