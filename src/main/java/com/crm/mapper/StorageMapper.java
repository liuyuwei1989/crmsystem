package com.crm.mapper;

import com.crm.entity.Storage;
import com.crm.entity.StorageExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageMapper {
    long countByExample(StorageExample example);

    int deleteByExample(StorageExample example);

    int deleteByPrimaryKey(BigDecimal stkId);

    int insert(Storage record);

    int insertSelective(Storage record);

    List<Storage> selectByExample(StorageExample example);

    Storage selectByPrimaryKey(BigDecimal stkId);

    int updateByExampleSelective(@Param("record") Storage record, @Param("example") StorageExample example);

    int updateByExample(@Param("record") Storage record, @Param("example") StorageExample example);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);
}