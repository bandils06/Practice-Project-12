package com.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.spring.dao.EProductDao;
import com.spring.entity.EProductEntity;

@Controller
public class MainController extends HttpServlet{
	
	

 
	
	@Autowired
	EProductDao dao;
	int id;
	String name;
	long price;

	@GetMapping("/listproduct")
	public String getAllProducts(ModelMap map, HttpServletRequest req, HttpServletResponse res) throws IOException {
//		res.setContentType("text/html");
//		PrintWriter out= res.getWriter();
//		out.print("in getAllProducts method");
		
		List<EProductEntity> list= dao.getAllProducts();
		map.addAttribute("list", list);
		return "product";
		
	}
	

	@GetMapping("/updateDetails")
	public String updateDetailsById(ModelMap map, HttpServletRequest req, HttpServletResponse res) throws IOException  {
//		res.setContentType("text/html");
//		PrintWriter out= res.getWriter();
//		out.print("in getProductById method");
		
		this.id = Integer.parseInt(req.getParameter("id"));
		this.name = req.getParameter("name");
		this.price = Integer.parseInt(req.getParameter("price"));
		EProductEntity obj = new EProductEntity();
		obj.setId(id);
		obj.setName(name);
		obj.setPrice(price);
		
		dao.updateProduct(obj);

//		List<EProductEntity> list= dao.getProductById(id);
//		map.addAttribute("list", list);

		return "product";
	}
	
	@GetMapping("/filterbyid")
	public String getProductByID(HttpServletRequest request,ModelMap map) {
		this.id=Integer.parseInt(request.getParameter("id"));
		List<EProductEntity> list=dao.getProductById(id);
		map.addAttribute("list",list);
		return "product";
	}
}
