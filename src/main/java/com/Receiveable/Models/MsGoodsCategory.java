package com.Receiveable.Models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ms_goods_category")
public class MsGoodsCategory {
	@Id
	@Column(name="mgc_id", nullable = false)
	private BigDecimal mgcId;	
	
	@Column(name="mgc_desc", length=100)
	private String mgcDesc;
	
	@Column(name="mg_createdby", length=15)
	private String mgCreateBy;
	
	@Column(name="mg_createdate")
	private Date mgCreateDate;
	
	@Column(name="mg_updateby", length=15)
	private String mgUpdateBy;
	
	@Column(name="mg_updatedate")
	private Date mgUpdateDate;

}
