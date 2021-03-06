package com.crm.mapper;

import com.crm.entity.CstService;
import com.crm.entity.CstServiceExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstServiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_SERVICE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    long countByExample(CstServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_SERVICE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int deleteByExample(CstServiceExample example);

    /**
     * 
     * 通过id删除
     */
    int deleteByPrimaryKey(BigDecimal svrId);

    /**
     * 增加
     */
    int insert(CstService record);

    /**
     * 
     * 增加动态sql
     */
    int insertSelective(CstService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_SERVICE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    List<CstService> selectByExample(CstServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_SERVICE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    CstService selectByPrimaryKey(BigDecimal svrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_SERVICE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExampleSelective(@Param("record") CstService record, @Param("example") CstServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_SERVICE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExample(@Param("record") CstService record, @Param("example") CstServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_SERVICE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKeySelective(CstService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_SERVICE
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKey(CstService record);
    
}