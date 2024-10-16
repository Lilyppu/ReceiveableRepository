package com.Receiveable.Repository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Receiveable.Models.MsGoodsType;

@Repository
public interface IMsGoodsTypeRepository  extends JpaRepository<MsGoodsType, BigDecimal>{
	
	public Optional<MsGoodsType> findByMgtId(BigDecimal id);

}
