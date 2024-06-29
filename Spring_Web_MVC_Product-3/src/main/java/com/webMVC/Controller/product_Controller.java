package com.webMVC.Controller;

import java.util.List;
import java.util.Optional;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webMVC.Repository.product_Repo;
import com.webMVC.entity.Product;

@Controller
public class product_Controller 
{
	@Autowired
 private product_Repo repo;
	
	
	
	
	
	@GetMapping("/")
	public String loadhome(Model model) {
		
		
		return "home";
	}

	@GetMapping("/index")
	public String loadform(Model model) {
		
		model.addAttribute("p", new Product());
	
		
		return "index";
	}

	
	 @PostMapping("/product")                          // same object ko waspas return karne ke liye
	public String  saveData( @Validated    @ModelAttribute("p") Product p, BindingResult result , Model model ) {
	
		 System.out.println(p);
	
		// int i=10/0;
		 
		 if (result.hasErrors()) {
			return "index";
		}
		 
		 p=repo.save(p);
		
		if (p.getPid()!=null) {
			model.addAttribute("msg", " Product Save..");
		}
		
		p.setName("");
		p.setPrice(null);
		p.setQty(null);
		
		
		
	
		return "index";
		
	}
	
	 @GetMapping("/Allproducts")
	 public String loatProduct(Model model) 
	 {
	List< Product> list = repo.findAll();
		 
		 model.addAttribute("products",list);
		 
		 return "data";
	 }
	
	 @GetMapping("/delete")
	public String delete(@RequestParam("pid") Integer pid , Model model) {
		
		 
		 repo.deleteById(pid);
		 
		 model.addAttribute("msg", " Product Delete");
		 model.addAttribute("products", repo.findAll());
		 
		 return "data";
	}
	
	 @GetMapping("/edit")
	 public String edit( @RequestParam("pid") Integer pid , Model model) {
		 
		 
		 Optional<Product> findbyid = repo.findById(pid);
		 
		 if (findbyid.isPresent()) {
			
			 Product product = findbyid.get();
			 model.addAttribute("p", product);
		}
		 
		 
		 
		 return "index";
	 }
	 
	 
	 
}
