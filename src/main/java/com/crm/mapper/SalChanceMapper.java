package com.crm.mapper;

import com.crm.entity.SalChance;
import com.crm.entity.SalChanceExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalChanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    long countByExample(SalChanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int deleteByExample(SalChanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int deleteByPrimaryKey(BigDecimal chcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int insert(SalChance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int insertSelective(SalChance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    List<SalChance> selectByExample(SalChanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    SalChance selectByPrimaryKey(BigDecimal chcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExampleSelective(@Param("record") SalChance record, @Param("example") SalChanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExample(@Param("record") SalChance record, @Param("example") SalChanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKeySelective(SalChance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAL_CHANCE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKey(SalChance record);
}