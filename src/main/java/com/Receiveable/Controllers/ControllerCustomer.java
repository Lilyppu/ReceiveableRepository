package com.Receiveable.Controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Receiveable.Models.Customer;
import com.Receiveable.Services.ServiceCustomer;


@RestController
public class ControllerCustomer {
	@Autowired
	ServiceCustomer servCust;
	
	@GetMapping("/goods/getCustlist")
	public List<Customer> getCustAll (){
		return servCust.getCustAll();
	}
	
	@GetMapping("/goods/getCustSingle")
	public Optional<Customer> getCustSingle (Integer id){
		return servCust.getCustSingle(id);
	}
	

}
