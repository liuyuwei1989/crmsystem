package com.crm.entity;

import java.math.BigDecimal;

public class SysUser {
    /**
     *
     * 用户编码
     * 
     *
     * 
     */
    private BigDecimal usrId;

    /**
     *
     * 用户姓名
     * 
     *
     * 
     */
    private String usrName;

    /**
     *
     * 
     * 
     *用户密码
     * 
     */
    private String usrPassword;

    /**
     *
     * 
     * 
     *用户—角色
     * 
     */
    private BigDecimal usrRoleId;

    /**
     *
     *用户标记
     * 
     *
     * 
     */
    private Long usrFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USR_ID
     *
     * @return the value of SYS_USER.USR_ID
     *
     * @mbg.generated Tue Aug 29 10:30:01 CST 2017
     */
    public BigDecimal getUsrId() {
        return usrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USR_ID
     *
     * @param usrId the value for SYS_USER.USR_ID
     *
     * @mbg.generated Tue Aug 29 10:30:01 CST 2017
     */
    public void setUsrId(BigDecimal usrId) {
        this.usrId = usrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USR_NAME
     *
     * @return the value of SYS_USER.USR_NAME
     *
     * @mbg.generated Tue Aug 29 10:30:01 CST 2017
     */
    public String getUsrName() {
        return usrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USR_NAME
     *
     * @param usrName the value for SYS_USER.USR_NAME
     *
     * @mbg.generated Tue Aug 29 10:30:01 CST 2017
     */
    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USR_PASSWORD
     *
     * @return the value of SYS_USER.USR_PASSWORD
     *
     * @mbg.generated Tue Aug 29 10:30:01 CST 2017
     */
    public String getUsrPassword() {
        return usrPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USR_PASSWORD
     *
     * @param usrPassword the value for SYS_USER.USR_PASSWORD
     *
     * @mbg.generated Tue Aug 29 10:30:01 CST 2017
     */
    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword == null ? null : usrPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USR_ROLE_ID
     *
     * @return the value of SYS_USER.USR_ROLE_ID
     *
     * @mbg.generated Tue Aug 29 10:30:01 CST 2017
     */
    public BigDecimal getUsrRoleId() {
        return usrRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USR_ROLE_ID
     *
     * @param usrRoleId the value for SYS_USER.USR_ROLE_ID
     *
     * @mbg.generated Tue Aug 29 10:30:01 CST 2017
     */
    public void setUsrRoleId(BigDecimal usrRoleId) {
        this.usrRoleId = usrRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USR_FLAG
     *
     * @return the value of SYS_USER.USR_FLAG
     *
     * @mbg.generated Tue Aug 29 10:30:01 CST 2017
     */
    public Long getUsrFlag() {
        return usrFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USR_FLAG
     *
     * @param usrFlag the value for SYS_USER.USR_FLAG
     *
     * @mbg.generated Tue Aug 29 10:30:01 CST 2017
     */
    public void setUsrFlag(Long usrFlag) {
        this.usrFlag = usrFlag;
    }
}