package com.product.category.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping("/category")
	public String listCategorys(Model model) {
		List<Category> listCategorys = categoryRepository.findAll();
		model.addAttribute("listCategorys", listCategorys);
		return "categorys";
	}
	
	@GetMapping("/category/new")
	public String categoryNew(Model model) {
		model.addAttribute("category", new Category());
		return "category_formulary";
	}
}
