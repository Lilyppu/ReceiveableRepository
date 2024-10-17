package com.Receiveable.Controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Receiveable.Models.MsGoods;
import com.Receiveable.Repository.IMsGoodsRepository;
import com.Receiveable.Services.ServiceMsGoods;


@RestController
public class ControllerMsGoods {
	@Autowired
	ServiceMsGoods servMg;
	
	@GetMapping("/goods/getgoodslist")
	public List<MsGoods> getGoodsAll (){
		return servMg.getGoodsAll();
	}
	
	@GetMapping("/goods/getgoodssingle")
	public Optional<MsGoods> getGoodsTypeSingle (Integer id){
		return servMg.getGoodsTypeSingle(id);
	}
}
