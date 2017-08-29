package com.crm.mapper;

import com.crm.entity.BasDict;
import com.crm.entity.BasDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    long countByExample(BasDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int deleteByExample(BasDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int deleteByPrimaryKey(Integer dictId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int insert(BasDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int insertSelective(BasDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    List<BasDict> selectByExample(BasDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    BasDict selectByPrimaryKey(Integer dictId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExampleSelective(@Param("record") BasDict record, @Param("example") BasDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExample(@Param("record") BasDict record, @Param("example") BasDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKeySelective(BasDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BAS_DICT
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKey(BasDict record);
}