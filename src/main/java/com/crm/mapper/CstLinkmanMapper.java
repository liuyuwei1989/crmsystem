package com.crm.mapper;

import com.crm.entity.CstLinkman;
import com.crm.entity.CstLinkmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstLinkmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    long countByExample(CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int deleteByExample(CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int deleteByPrimaryKey(Integer lkmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int insert(CstLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int insertSelective(CstLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    List<CstLinkman> selectByExampleWithBLOBs(CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    List<CstLinkman> selectByExample(CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    CstLinkman selectByPrimaryKey(Integer lkmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExampleSelective(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByExample(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKeySelective(CstLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(CstLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CST_LINKMAN
     *
     * @mbg.generated Tue Aug 29 10:30:00 CST 2017
     */
    int updateByPrimaryKey(CstLinkman record);
}