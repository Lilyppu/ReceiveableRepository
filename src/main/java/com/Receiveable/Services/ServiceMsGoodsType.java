package com.Receiveable.Services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Receiveable.Models.MsGoodsType;
import com.Receiveable.Repository.IMsGoodsTypeRepository;

@Service
public class ServiceMsGoodsType {
	@Autowired
	IMsGoodsTypeRepository repoMgt;
	
	public List<MsGoodsType> getGoodsTypeAll (){
		return repoMgt.findAll();
	}
	
	public Optional<MsGoodsType> getGoodsTypeSingle (BigDecimal id){
		return repoMgt.findById(null);
	}
	
	
}
