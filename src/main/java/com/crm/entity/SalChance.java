package com.crm.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
	/**
	 * 营销机会表实体类
	 */
public class SalChance {
	/**
	 * 营销机会id
	 */
    private BigDecimal chcId;
	    
	/**
	 * 客戶來源
	 * 
	 */
    
    private String chcSource;

   /**
    *  客户姓名
    */
    private String chcCustName;

   /**
    * 基本概要
    * 
    */
    private String chcTitle;

    /**
     * 成功几率
     */
    private Long chcRate;

    /**
     * 联系人
     * 
     */
    private String chcLinkman;
    
    /**
     * 联系人电话
     */
    private String chcTel;

    /**
     * 机会描述
     */
    private String chcDesc;

    /**
     * 创建人Id
     */
    private BigDecimal chcCreateId;

   /**
    * 客户信息创建人
    */
    private String chcCreateBy;

    /**
     * 客户信息创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date chcCreateDate;

    /**
     * 指派人id
     */
    private BigDecimal chcDueId;

    /**
     * 指派人名
     */
    private String chcDueTo;

    /**
     * 指派的时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date chcDueDate;

    /**
     * 指派人的状态
     */
    private String chcStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_ID
     *
     * @return the value of SAL_CHANCE.CHC_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public BigDecimal getChcId() {
        return chcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_ID
     *
     * @param chcId the value for SAL_CHANCE.CHC_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcId(BigDecimal chcId) {
        this.chcId = chcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_SOURCE
     *
     * @return the value of SAL_CHANCE.CHC_SOURCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getChcSource() {
        return chcSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_SOURCE
     *
     * @param chcSource the value for SAL_CHANCE.CHC_SOURCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcSource(String chcSource) {
        this.chcSource = chcSource == null ? null : chcSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_CUST_NAME
     *
     * @return the value of SAL_CHANCE.CHC_CUST_NAME
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getChcCustName() {
        return chcCustName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_CUST_NAME
     *
     * @param chcCustName the value for SAL_CHANCE.CHC_CUST_NAME
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcCustName(String chcCustName) {
        this.chcCustName = chcCustName == null ? null : chcCustName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_TITLE
     *
     * @return the value of SAL_CHANCE.CHC_TITLE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getChcTitle() {
        return chcTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_TITLE
     *
     * @param chcTitle the value for SAL_CHANCE.CHC_TITLE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcTitle(String chcTitle) {
        this.chcTitle = chcTitle == null ? null : chcTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_RATE
     *
     * @return the value of SAL_CHANCE.CHC_RATE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public Long getChcRate() {
        return chcRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_RATE
     *
     * @param chcRate the value for SAL_CHANCE.CHC_RATE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcRate(Long chcRate) {
        this.chcRate = chcRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_LINKMAN
     *
     * @return the value of SAL_CHANCE.CHC_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getChcLinkman() {
        return chcLinkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_LINKMAN
     *
     * @param chcLinkman the value for SAL_CHANCE.CHC_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcLinkman(String chcLinkman) {
        this.chcLinkman = chcLinkman == null ? null : chcLinkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_TEL
     *
     * @return the value of SAL_CHANCE.CHC_TEL
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getChcTel() {
        return chcTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_TEL
     *
     * @param chcTel the value for SAL_CHANCE.CHC_TEL
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcTel(String chcTel) {
        this.chcTel = chcTel == null ? null : chcTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_DESC
     *
     * @return the value of SAL_CHANCE.CHC_DESC
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getChcDesc() {
        return chcDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_DESC
     *
     * @param chcDesc the value for SAL_CHANCE.CHC_DESC
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcDesc(String chcDesc) {
        this.chcDesc = chcDesc == null ? null : chcDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_CREATE_ID
     *
     * @return the value of SAL_CHANCE.CHC_CREATE_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public BigDecimal getChcCreateId() {
        return chcCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_CREATE_ID
     *
     * @param chcCreateId the value for SAL_CHANCE.CHC_CREATE_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcCreateId(BigDecimal chcCreateId) {
        this.chcCreateId = chcCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_CREATE_BY
     *
     * @return the value of SAL_CHANCE.CHC_CREATE_BY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getChcCreateBy() {
        return chcCreateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_CREATE_BY
     *
     * @param chcCreateBy the value for SAL_CHANCE.CHC_CREATE_BY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcCreateBy(String chcCreateBy) {
        this.chcCreateBy = chcCreateBy == null ? null : chcCreateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_CREATE_DATE
     *
     * @return the value of SAL_CHANCE.CHC_CREATE_DATE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public Date getChcCreateDate() {
        return chcCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_CREATE_DATE
     *
     * @param chcCreateDate the value for SAL_CHANCE.CHC_CREATE_DATE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcCreateDate(Date chcCreateDate) {
        this.chcCreateDate = chcCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_DUE_ID
     *
     * @return the value of SAL_CHANCE.CHC_DUE_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public BigDecimal getChcDueId() {
        return chcDueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_DUE_ID
     *
     * @param chcDueId the value for SAL_CHANCE.CHC_DUE_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcDueId(BigDecimal chcDueId) {
        this.chcDueId = chcDueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_DUE_TO
     *
     * @return the value of SAL_CHANCE.CHC_DUE_TO
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getChcDueTo() {
        return chcDueTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_DUE_TO
     *
     * @param chcDueTo the value for SAL_CHANCE.CHC_DUE_TO
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcDueTo(String chcDueTo) {
        this.chcDueTo = chcDueTo == null ? null : chcDueTo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_DUE_DATE
     *
     * @return the value of SAL_CHANCE.CHC_DUE_DATE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public Date getChcDueDate() {
        return chcDueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_DUE_DATE
     *
     * @param chcDueDate the value for SAL_CHANCE.CHC_DUE_DATE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcDueDate(Date chcDueDate) {
        this.chcDueDate = chcDueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_CHANCE.CHC_STATUS
     *
     * @return the value of SAL_CHANCE.CHC_STATUS
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getChcStatus() {
        return chcStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_CHANCE.CHC_STATUS
     *
     * @param chcStatus the value for SAL_CHANCE.CHC_STATUS
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setChcStatus(String chcStatus) {
        this.chcStatus = chcStatus == null ? null : chcStatus.trim();
    }
}