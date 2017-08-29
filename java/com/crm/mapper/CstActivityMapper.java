package com.crm.mapper;

import com.crm.entity.CstActivity;
import com.crm.entity.CstActivityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    long countByExample(CstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int deleteByExample(CstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int deleteByPrimaryKey(BigDecimal atvId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int insert(CstActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int insertSelective(CstActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    List<CstActivity> selectByExample(CstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    CstActivity selectByPrimaryKey(BigDecimal atvId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExampleSelective(@Param("record") CstActivity record, @Param("example") CstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExample(@Param("record") CstActivity record, @Param("example") CstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKeySelective(CstActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_ACTIVITY
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKey(CstActivity record);
}