package com.crm.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SalPlan {
   /**
    * 计划表id
    */
    private BigDecimal plaId;
    
	/**
	 * 营销机会表Id
	 */
    private BigDecimal plaChcId;

   /**
    * 计划创建时间
    */
    private Date plaDate;

    /**
     * 计划创建人
     */
    private String plaTodo;

    /**
     * 计划内容
     */
    private String plaResult;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_PLAN.PLA_ID
     *
     * @return the value of SAL_PLAN.PLA_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public BigDecimal getPlaId() {
        return plaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_PLAN.PLA_ID
     *
     * @param plaId the value for SAL_PLAN.PLA_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setPlaId(BigDecimal plaId) {
        this.plaId = plaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_PLAN.PLA_CHC_ID
     *
     * @return the value of SAL_PLAN.PLA_CHC_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public BigDecimal getPlaChcId() {
        return plaChcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_PLAN.PLA_CHC_ID
     *
     * @param plaChcId the value for SAL_PLAN.PLA_CHC_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setPlaChcId(BigDecimal plaChcId) {
        this.plaChcId = plaChcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_PLAN.PLA_DATE
     *
     * @return the value of SAL_PLAN.PLA_DATE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public Date getPlaDate() {
        return plaDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_PLAN.PLA_DATE
     *
     * @param plaDate the value for SAL_PLAN.PLA_DATE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setPlaDate(Date plaDate) {
        this.plaDate = plaDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_PLAN.PLA_TODO
     *
     * @return the value of SAL_PLAN.PLA_TODO
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getPlaTodo() {
        return plaTodo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_PLAN.PLA_TODO
     *
     * @param plaTodo the value for SAL_PLAN.PLA_TODO
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setPlaTodo(String plaTodo) {
        this.plaTodo = plaTodo == null ? null : plaTodo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAL_PLAN.PLA_RESULT
     *
     * @return the value of SAL_PLAN.PLA_RESULT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getPlaResult() {
        return plaResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAL_PLAN.PLA_RESULT
     *
     * @param plaResult the value for SAL_PLAN.PLA_RESULT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setPlaResult(String plaResult) {
        this.plaResult = plaResult == null ? null : plaResult.trim();
    }
}