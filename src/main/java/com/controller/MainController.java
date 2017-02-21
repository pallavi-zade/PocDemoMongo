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
import com.model.InventaryInfo;
import com.model.Mapping;
import com.model.PaymentInfo;
import com.model.ProLevel;
import com.model.Product;
import com.model.ProductLevelMapping;
import com.model.ProductTypeLevel;
import com.model.PurchaseInfo;
import com.model.SalesInfo;
import com.model.sql.UserMaster;
import com.repository.ProductMongoRepository;
import com.repository.ProductSearchRepository;
import com.repository.CustomerMongoRepository;
import com.repository.InventaryMongoRepository;
import com.repository.PaymentMongoRepository;
import com.repository.ProductMapping;
import com.repository.ProductTypeLevelMongoRepository;
import com.repository.PurchaseMongoRepository;
import com.repository.SaleMongoRepository;
import com.service.sql.UserMasterService;

@RestController
public class MainController {

	@Autowired
	ProductMongoRepository productRepository;
	@Autowired
	ProductTypeLevelMongoRepository ProductTypeLevelMongoRepository;
	@Autowired
	ProductMapping productMapping;
	@Autowired
	SaleMongoRepository  saleMongoRepository;
	@Autowired
	PurchaseMongoRepository purchaseMongoRepository;
	@Autowired
	CustomerMongoRepository customerMongoRepository;
	@Autowired
	PaymentMongoRepository paymentMongoRepository;
	@Autowired 
	InventaryMongoRepository inventaryMongoRepository;
	@Autowired 
	UserMasterService userMasterService;

	@RequestMapping("/home")
	public @ResponseBody ResponseEntity<ArrayList<Product>> home(Model model) {
		model.addAttribute("carList", productRepository.findAll());
		ArrayList<Product> array = (ArrayList<Product>) productRepository.findAll();
		return new ResponseEntity<ArrayList<Product>>(array, HttpStatus.OK);
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String addProduct() {
		List<String> list = FileToArray.getFileToArray();
		for (String string : list) {
			Product product = new Product();
			product.setName(string);
			System.out.println(product + "{}}}}}}}}}}}}}}}}}}}}}}}}}");
			productRepository.save(product);
		}

		return "redirect:home";
	}
	
	@RequestMapping(value = "/NewCollections", method = RequestMethod.POST)
	public String addNewCollections() {
		ArrayList<UserMaster> array = (ArrayList<UserMaster>) userMasterService.getUser();
		for (UserMaster userMaster : array) {
			CustomerInfo customerInfo=new CustomerInfo();
			customerInfo.setCustomerName(userMaster.getFirstName());
			customerMongoRepository.save(customerInfo);
		}
	
	//paymentMongoRepository.save(new PaymentInfo());
	//saleMongoRepository.save(new SalesInfo());
	//purchaseMongoRepository.save(new PurchaseInfo());
	//inventaryMongoRepository.save(new InventaryInfo());
	

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
					System.out.println(":::::::::::::::Name:::::::::::"+object.getName()+":::::::::::::::Return from Product:::::::::::"+productRepository.returnProductForMapping(object.getName()).getId());
					productLevelMapping.setProductId(productRepository.returnProductForMapping(object.getName()).getId());
					
					
			         productMapping.save(productLevelMapping);
				}
				
				System.out.println("***********************************************************************");
			
		}
		
		return "redirect:home";
	}
	
	

	
	@RequestMapping(value = "/saveSqlData")
	public String saveSqlData() {
		UserMaster user=new UserMaster();
		user.setEmail("pallavi@gmail.com");
		user.setFirstName("pallavi");
		userMasterService.saveUser(user);
		return "home";
	}
	

	@RequestMapping("/readSqlData")
	public @ResponseBody ResponseEntity<ArrayList<UserMaster>> readSqlData() {
		
		ArrayList<UserMaster> array = (ArrayList<UserMaster>) userMasterService.getUser();
		return new ResponseEntity<ArrayList<UserMaster>>(array, HttpStatus.OK);
	}
	
	
	
}
