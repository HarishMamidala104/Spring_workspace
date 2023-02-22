package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ojas.model.Product;
import com.ojas.service.ProductService;

@Controller
@RequestMapping("/controller")
public class ProductController {
	@Autowired
	private ProductService service;

	@RequestMapping("/add")
	public String addproduct(Model model) {
		Product pro = new Product();
		model.addAttribute("productkey", pro);
		return "product";
	}

	@RequestMapping("/register")
	public String register(@ModelAttribute("productkey") Product pro, Model model) {
		int count = service.addproduct(pro);
		return "product";

	}

	@RequestMapping("/viewrecords")
	public String viewProducts(Model model) {
		List<Product> viewProducts = service.viewProducts();
		for (Product p : viewProducts) {
			System.out.println(p);
		}
		model.addAttribute("list", viewProducts);
		System.out.println(viewProducts);
		return "view";
	}

	@RequestMapping("/edit")
	public String editProduct(@RequestParam("pid") int pid, Model model) {
		Product product = service.editProduct(pid);
		model.addAttribute("EditList", product);
		return "edit";

	}

	@RequestMapping("/delete")
	public String deleteProduct(@RequestParam("pid") int pid) {
		service.deleteProduct(pid);
		return "redirect:/controller/viewrecords";
	}

	@RequestMapping("/update")
	public String updateProduct(@ModelAttribute Product product) {
		service.updateProduct(product);
		return "redirect:/controller/viewrecords";

	}
}
