package com.Receiveable.Services;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Receiveable.Models.MsGoodsCategory;
import com.Receiveable.Repository.IMsGoodsCategoryRepository;
import com.Receiveable.Repository.IMsGoodsTypeRepository;

@Service
public class ServiceMsGoodsCategory {
	@Autowired
	IMsGoodsCategoryRepository repoMgc;
	
	public List<MsGoodsCategory> getGoodsTypeAll (){
		return repoMgc.findAll();
	}
	
	public Optional<MsGoodsCategory> getGoodsTypeSingle (BigDecimal id){
		return repoMgc.findById(null);
	}
}
