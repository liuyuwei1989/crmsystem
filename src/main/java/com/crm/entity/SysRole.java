package com.crm.entity;

import java.math.BigDecimal;

public class SysRole {
    /**
     *
     * 
     * 
     *角色编号
     * 
     */
    private Integer roleId;

    /**
     *
     * 
     * 
     *
     *角色名称
     */
    private String roleName;

    /**
     *
     * 
     * 
     *
     * 角色拥有权限
     */
    private String roleDesc;

    /**
     *
     * 
     * 
     *
     *角色标记
     */
    private BigDecimal roleFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLE.ROLE_ID
     *
     * @return the value of SYS_ROLE.ROLE_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLE.ROLE_ID
     *
     * @param roleId the value for SYS_ROLE.ROLE_ID
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLE.ROLE_NAME
     *
     * @return the value of SYS_ROLE.ROLE_NAME
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLE.ROLE_NAME
     *
     * @param roleName the value for SYS_ROLE.ROLE_NAME
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLE.ROLE_DESC
     *
     * @return the value of SYS_ROLE.ROLE_DESC
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLE.ROLE_DESC
     *
     * @param roleDesc the value for SYS_ROLE.ROLE_DESC
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLE.ROLE_FLAG
     *
     * @return the value of SYS_ROLE.ROLE_FLAG
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public BigDecimal getRoleFlag() {
        return roleFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLE.ROLE_FLAG
     *
     * @param roleFlag the value for SYS_ROLE.ROLE_FLAG
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    public void setRoleFlag(BigDecimal roleFlag) {
        this.roleFlag = roleFlag;
    }
}