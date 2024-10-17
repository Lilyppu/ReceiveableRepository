package com.Receiveable.Services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Receiveable.Models.MsGoods;
import com.Receiveable.Repository.IMsGoodsRepository;




@Service
public class ServiceMsGoods {
	@Autowired
	IMsGoodsRepository repoMg;
	
	public List<MsGoods> getGoodsAll (){
		return repoMg.findAll();
	}
	
	public Optional<MsGoods> getGoodsTypeSingle (Integer id){
		return repoMg.findById(id);
	}
	

}
