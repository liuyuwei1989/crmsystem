package com.crm.entity;

import java.math.BigDecimal;

public class Storage {
    private BigDecimal stkId;

    private BigDecimal stkProdId;

    private String stkWarehouse;

    private String stkWare;

    private Long stkCount;

    private String stkMemo;

    public BigDecimal getStkId() {
        return stkId;
    }

    public void setStkId(BigDecimal stkId) {
        this.stkId = stkId;
    }

    public BigDecimal getStkProdId() {
        return stkProdId;
    }

    public void setStkProdId(BigDecimal stkProdId) {
        this.stkProdId = stkProdId;
    }

    public String getStkWarehouse() {
        return stkWarehouse;
    }

    public void setStkWarehouse(String stkWarehouse) {
        this.stkWarehouse = stkWarehouse == null ? null : stkWarehouse.trim();
    }

    public String getStkWare() {
        return stkWare;
    }

    public void setStkWare(String stkWare) {
        this.stkWare = stkWare == null ? null : stkWare.trim();
    }

    public Long getStkCount() {
        return stkCount;
    }

    public void setStkCount(Long stkCount) {
        this.stkCount = stkCount;
    }

    public String getStkMemo() {
        return stkMemo;
    }

    public void setStkMemo(String stkMemo) {
        this.stkMemo = stkMemo == null ? null : stkMemo.trim();
    }
}