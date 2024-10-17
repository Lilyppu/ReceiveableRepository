package com.Receiveable.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Receiveable.Models.MsGoods;
import com.Receiveable.Models.MsGoodsCategory;

@Repository
public interface IMsGoodsRepository extends JpaRepository <MsGoods, Integer>{
	public Optional<MsGoods> findByMgId (Integer id);

}
