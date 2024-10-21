package com.Receiveable.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Receiveable.Models.Customer;
import com.Receiveable.Models.MsGoods;
import com.Receiveable.Models.MsGoodsCategory;

@Repository
public interface ICustomerRepository extends JpaRepository <Customer, Integer> {
	
	public List<Customer> findByCustId (Integer id);

}
