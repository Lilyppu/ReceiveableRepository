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
@Table(name = "customer")
public class Customer {
	
	@Id
	@Column(name="cust_id", nullable = false)
	private Integer custId;
	
	@Column(name="cust_name", length=100)
	private String custName;
	
	@Column(name="cust_address", length=100)
	private String custAddr;
	
	@Column(name="cust_zipcode", length=6)
	private String custZipcode;
	
	@Column(name="cust_city", length=60)
	private String custCity;
	
	@Column(name="cust_province", length=60)
	private String custProvince;
	
	@Column(name="cust_country", length=60)
	private String custCountry;
	
	@Column(name="cust_email", length=60)
	private String custEmail;
	
	@Column(name="cust_telp", length=20)
	private String custTelp;
	 
	@Column(name="cust_fax", length=20)
	private String custFax;
	
	@Column(name="cust_whatsapp", length=20)
	private String custWhatApp;
	
	@Column(name="cust_website", length=60)
	private String custWebSite;
	
	@Column(name="cust_debt")
	private BigDecimal custDebt;
	
	@Column(name="cust_days_limit", length=1)
	private String custDaysLimit;
	
	@Column(name="cust_days_limit_day")
	private Integer custDaysLimitDay;
	
	@Column(name="cust_amount_limit", length=1)
	private String custAmountLimit;
	
	@Column(name="cust_amount_limit_amount")
	private Integer custAmountLimitAmount;
	
	@Column(name="cust_tax_number", length=30)
	private String custTaxNo;
	
	@Column(name="cust_tax_name", length=60)
	private String custTaxName;
	
	@Column(name="cust_tax_sameaddress", length=1)
	private String custTaxSameAddr;

	@Column(name="cust_tax_address", length=100)
	private String custTaxAddr;
	
	@Column(name="cust_tax_city", length=60)
	private String custTaxCity;
	
	@Column(name="cust_tax_province", length=60)
	private String custTaxProvince;
	
	@Column(name="cust_tax_country", length=60)
	private String custTaxCountry;
	
	@Column(name="cust_tax_zipcode", length=6)
	private String custTaxZipCode;

	@Column(name="cust_createdby", length=15)
	private String custCreateBy;
	
	@Column(name="cust_createdate")
	private Date custCreateDate;
	
	@Column(name="cust_updateby", length=15)
	private String custUpdateBy;
	
	@Column(name="cust_updatedate")
	private Date custUpdateDate;




}
