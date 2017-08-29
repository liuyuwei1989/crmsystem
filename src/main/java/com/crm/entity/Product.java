package com.crm.entity;

import java.math.BigDecimal;

public class Product {
	/**
	 * 商品编号
	 */
    private BigDecimal prodId;
    /**
     * 商品名称
     */

    private String prodName;

    /**
     * 商品类型
     */
    private String prodType;
	/**
	 * 商品批次
	 */
    private String prodBatch;
	/**
	 * 商品单位
	 */
    private String prodUnit;
	/**
	 * 商品价格
	 */
    private Double prodPrice;
	/**
	 * 商品备忘录
	 */
    private String prodMemo;

    public BigDecimal getProdId() {
        return prodId;
    }

    public void setProdId(BigDecimal prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType == null ? null : prodType.trim();
    }

    public String getProdBatch() {
        return prodBatch;
    }

    public void setProdBatch(String prodBatch) {
        this.prodBatch = prodBatch == null ? null : prodBatch.trim();
    }

    public String getProdUnit() {
        return prodUnit;
    }

    public void setProdUnit(String prodUnit) {
        this.prodUnit = prodUnit == null ? null : prodUnit.trim();
    }

    public Double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdMemo() {
        return prodMemo;
    }

    public void setProdMemo(String prodMemo) {
        this.prodMemo = prodMemo == null ? null : prodMemo.trim();
    }
}