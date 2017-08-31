package com.crm.mapper;

import com.crm.entity.SalChance;
import com.crm.entity.SalChanceExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalChanceMapper {
  
    long countByExample(SalChanceExample example);

    
    int deleteByExample(SalChanceExample example);

  
    int deleteByPrimaryKey(BigDecimal chcId);

   
    int insert(SalChance record);

    int insertSelective(SalChance record);

    
    List<SalChance> selectByExample(SalChanceExample example);

   
    SalChance selectByPrimaryKey(BigDecimal chcId);

   
    int updateByExampleSelective(@Param("record") SalChance record, @Param("example") SalChanceExample example);

   
    int updateByExample(@Param("record") SalChance record, @Param("example") SalChanceExample example);

    
    int updateByPrimaryKeySelective(SalChance record);

    
    int updateByPrimaryKey(SalChance record);

	List<SalChance> findAllMarket();
}