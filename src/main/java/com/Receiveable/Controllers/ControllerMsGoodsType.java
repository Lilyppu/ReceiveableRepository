package com.Receiveable.Controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Receiveable.Models.MsGoodsType;
import com.Receiveable.Services.ServiceMsGoodsType;

@RestController
public class ControllerMsGoodsType {
	@Autowired
	ServiceMsGoodsType servMgt;
	
	@GetMapping("/goods/getgoodstypelist")
	public List<MsGoodsType> getGoodsTypeAll (){
		return servMgt.getGoodsTypeAll();
	}
	
	@GetMapping("/goods/getgoodstypesingle")
	public Optional<MsGoodsType> getGoodsTypeSingle (BigDecimal id){
		return servMgt.getGoodsTypeSingle(id);
	}
	
}
