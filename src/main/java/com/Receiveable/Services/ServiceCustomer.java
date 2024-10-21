package com.Receiveable.Services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Receiveable.Models.Customer;
import com.Receiveable.Repository.ICustomerRepository;
import com.Receiveable.Repository.IMsGoodsRepository;

@Service
public class ServiceCustomer {
	@Autowired
	ICustomerRepository repoCust;
	
	public List<Customer> getCustAll (){
		return repoCust.findAll();
	}
	
	public Optional<Customer> getCustSingle (Integer id){
		return repoCust.findById(id);
	}
}
