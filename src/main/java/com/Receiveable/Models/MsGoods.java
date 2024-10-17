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
@Table(name = "ms_goods")
public class MsGoods {
	
	@Id
	@Column(name="mg_id", nullable = false)
	private Integer mgId;

	@Column(name="mg_desc", length=100)
	private String mgDesc;
	
	@Column(name="mg_mgc_id")
	private BigDecimal mgMgcId;
	
	@Column(name="mg_mgt_id")
	private BigDecimal mgMgtId;
	
	@Column(name="mg_unit", length=10)
	private String mgUnit;
	
	@Column(name="mg_up_barcode", length=100)
	private String mgUpBarcode;
	
	@Column(name="mg_up_subtitute")
	private Integer mgUpSubtitute;
	
	@Column(name="mg_disc_code", length=20)
	private String mgDicsCode;
	
	@Column(name="mg_price")
	private BigDecimal mgPrice;
	
	@Column(name="mg_main_supplier", length=15)
	private String mgMainSupplier;
	
	@Column(name="mg_buy_price")
	private BigDecimal mgBuyPrice;
	
	@Column(name="mg_buy_qty_min")
	private BigDecimal mgBuyQtyMin;
	
	@Column(name="mg_min_stock")
	private Integer mgMinStock;
	
	@Column(name="mg_ppn", length=1)
	private String mgPpn;

	@Column(name="mg_ppnbm", length=1)
	private String mgPpnBm;
	
	@Column(name="mg_warehouse")
	private Integer mgWareHouse;

	@Column(name="mg_rack", length=30)
	private String mgRack;

	@Column(name="mg_qty")
	private Integer mgQty;
	
	@Column(name="mg_note", length=300)
	private String mgNote;
	
	@Column(name="mg_image_path", length=300)
	private String mgImagePath;
	
	@Column(name="mg_acc_code", length=15)
	private String mgAccCode;

}
