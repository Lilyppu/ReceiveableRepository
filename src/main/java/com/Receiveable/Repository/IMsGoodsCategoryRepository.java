package com.Receiveable.Repository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Receiveable.Models.MsGoodsCategory;

@Repository
public interface IMsGoodsCategoryRepository  extends JpaRepository<MsGoodsCategory, BigDecimal>{
	public Optional<MsGoodsCategory> findByMgcId(BigDecimal id);
}
