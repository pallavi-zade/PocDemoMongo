package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.CustomerInfo;
import com.model.FileToArray;
import com.model.Mapping;
import com.model.PaymentInfo;
import com.model.ProLevel;
import com.model.Product;
import com.model.ProductLevelMapping;
import com.model.ProductTypeLevel;
import com.model.PurchaseInfo;
import com.model.SalesInfo;
import com.repository.CarMongoRepository;
import com.repository.CarSearchRepository;
import com.repository.CustomerMongoRepository;
import com.repository.PaymentMongoRepository;
import com.repository.ProductMapping;
import com.repository.ProductTypeLevelMongoRepository;
import com.repository.PurchaseMongoRepository;
import com.repository.SaleMongoRepository;

@RestController
public class CarController {

	@Autowired
	CarMongoRepository carRepository;

	@Autowired
	CarSearchRepository carSearchRepository;
	@Autowired
	ProductTypeLevelMongoRepository ProductTypeLevelMongoRepository;
	@Autowired
	ProductMapping productMapping;
	@Autowired
	SaleMongoRepository saleMongoRepository;
	@Autowired
	PurchaseMongoRepository purchaseMongoRepository;
	@Autowired
	CustomerMongoRepository customerMongoRepository;
	@Autowired
	PaymentMongoRepository paymentMongoRepository;

	@RequestMapping("/home")
	public @ResponseBody ResponseEntity<ArrayList<Product>> home(Model model) {
		model.addAttribute("carList", carRepository.findAll());
		ArrayList<Product> array = (ArrayList<Product>) carRepository.findAll();
		return new ResponseEntity<ArrayList<Product>>(array, HttpStatus.OK);
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String addProduct() {
		List<String> list = FileToArray.getFileToArray();
		for (String string : list) {
			Product product = new Product();
			product.setName(string);
			System.out.println(product + "{}}}}}}}}}}}}}}}}}}}}}}}}}");
			carRepository.save(product);
		}

		return "redirect:home";
	}
	
	@RequestMapping(value = "/NewCollections", method = RequestMethod.POST)
	public String addNewCollections() {
	customerMongoRepository.save(new CustomerInfo());
	paymentMongoRepository.save(new PaymentInfo());
	saleMongoRepository.save(new SalesInfo());
	purchaseMongoRepository.save(new PurchaseInfo());
	

		return "redirect:home";
	}

	@RequestMapping(value = "/addTypeLevel", method = RequestMethod.POST)
	public String addTypeLevel() {
		List<ProLevel> list = FileToArray.getFileToArrayForLevel();
		for (ProLevel object : list) {
			ProductTypeLevel productTypeLevel = new ProductTypeLevel();
			productTypeLevel.setLevel(object.getLevel());
			productTypeLevel.setName(object.getName());
			System.out.println(productTypeLevel + "{}}}}}}}}}}}}}}}}}}}}}}}}}");
			ProductTypeLevelMongoRepository.save(productTypeLevel);
		}

		return "redirect:home";
	}

	@RequestMapping(value = "/addTypeLevelMapping", method = RequestMethod.POST)
	public String addTypeLevelMapping() {
	
		List<Mapping> list = FileToArray.getFileToArrayForMapping();
		for (Mapping object : list) {
			System.out.println("***********************************************************************");
				for (String mappingIndex : object.getMapping()) {
					ProductLevelMapping productLevelMapping = new ProductLevelMapping();
					System.out.println(":::::::::::Mapping:::::::::::::::::"+mappingIndex+":::::::Return from ProductLevelType:::::::::::::::::"+ProductTypeLevelMongoRepository.returnProductLevelForMapping(mappingIndex));
					productLevelMapping.setProductTypeLevelId(ProductTypeLevelMongoRepository.returnProductLevelForMapping(mappingIndex).getId()); 
					System.out.println(":::::::::::::::Name:::::::::::"+object.getName()+":::::::::::::::Return from Product:::::::::::"+carSearchRepository.returnProductForMapping(object.getName()).getId());
					productLevelMapping.setProductId(carSearchRepository.returnProductForMapping(object.getName()).getId());
					
					
			         productMapping.save(productLevelMapping);
				}
				
				System.out.println("***********************************************************************");
			
		}
		
		return "redirect:home";
	}
	
	
	@RequestMapping(value = "/search")
	public String search(Model model, @RequestParam String search) {
		model.addAttribute("carList", carSearchRepository.searchCars(search));
		model.addAttribute("search", search);
		return "home";
	}
	
	@RequestMapping(value = "/me")
	public String search() {
	
		return "home";
	}
	
	
	
}
