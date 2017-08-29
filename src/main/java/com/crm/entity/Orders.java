package com.crm.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
	/**
	 * 订单号
	 */
	private BigDecimal odrId;
	/**
	 * 订单客户
	 */
	private String odrCustomer;
	/**
	 * 订单日期
	 */
	private Date odrDate;
	/**
	 * 订单地址
	 */
	private String odrAddr;
	/**
	 * 订单状态
	 */
	private String odrStatus;

	public BigDecimal getOdrId() {
		return odrId;
	}

	public void setOdrId(BigDecimal odrId) {
		this.odrId = odrId;
	}

	public String getOdrCustomer() {
		return odrCustomer;
	}

	public void setOdrCustomer(String odrCustomer) {
		this.odrCustomer = odrCustomer == null ? null : odrCustomer.trim();
	}

	public Date getOdrDate() {
		return odrDate;
	}

	public void setOdrDate(Date odrDate) {
		this.odrDate = odrDate;
	}

	public String getOdrAddr() {
		return odrAddr;
	}

	public void setOdrAddr(String odrAddr) {
		this.odrAddr = odrAddr == null ? null : odrAddr.trim();
	}

	public String getOdrStatus() {
		return odrStatus;
	}

	public void setOdrStatus(String odrStatus) {
		this.odrStatus = odrStatus == null ? null : odrStatus.trim();
	}
}