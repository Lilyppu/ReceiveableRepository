package com.Receiveable.Controllers;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Receiveable.Models.MsGoodsCategory;
import com.Receiveable.Services.ServiceMsGoodsCategory;
import com.Receiveable.Services.ServiceMsGoodsType;

@RestController
public class ControllerMsGoodsCategory {
	@Autowired
	ServiceMsGoodsCategory servMgc;
	
	@GetMapping("/goods/getgoodscatlist")
	public List<MsGoodsCategory> getGoodsCategoryAll (){
		return servMgc.getGoodsTypeAll();
	}
	
	@GetMapping("/goods/getgoodscatsingle")
	public Optional<MsGoodsCategory> getGoodsCategorySingle (BigDecimal id){
		return servMgc.getGoodsTypeSingle(id);
	}
	
}
