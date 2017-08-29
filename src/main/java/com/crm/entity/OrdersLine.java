package com.crm.entity;

import java.math.BigDecimal;

public class OrdersLine {
	/**
	 * 行唯一标识
	 */
    private BigDecimal oddId;
    /**
	 * 订单ID
	 */
    private BigDecimal oddOrderId;
    /**
	 * 商品ID
	 */
    private BigDecimal oddProdId;
    /**
	 * 商品数量
	 */
    private Long oddCount;
    /**
	 * 商品单位
	 */
    private String oddUnit;
    /**
	 * 商品价格
	 */
    private Double oddPrice;

    public BigDecimal getOddId() {
        return oddId;
    }

    public void setOddId(BigDecimal oddId) {
        this.oddId = oddId;
    }

    public BigDecimal getOddOrderId() {
        return oddOrderId;
    }

    public void setOddOrderId(BigDecimal oddOrderId) {
        this.oddOrderId = oddOrderId;
    }

    public BigDecimal getOddProdId() {
        return oddProdId;
    }

    public void setOddProdId(BigDecimal oddProdId) {
        this.oddProdId = oddProdId;
    }

    public Long getOddCount() {
        return oddCount;
    }

    public void setOddCount(Long oddCount) {
        this.oddCount = oddCount;
    }

    public String getOddUnit() {
        return oddUnit;
    }

    public void setOddUnit(String oddUnit) {
        this.oddUnit = oddUnit == null ? null : oddUnit.trim();
    }

    public Double getOddPrice() {
        return oddPrice;
    }

    public void setOddPrice(Double oddPrice) {
        this.oddPrice = oddPrice;
    }
}