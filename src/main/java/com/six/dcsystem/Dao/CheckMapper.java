package com.six.dcsystem.Dao;

import com.six.dcsystem.Bean.Check;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckMapper {
    int deleteByPrimaryKey(Integer checkkey);

    int insert(Check record);

    int insertSelective(Check record);

    Check selectByPrimaryKey(Integer checkkey);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);

    //根据状态查询数据库中信息
    Check selecteZt(int id);

    //查询所有数据
    Check cheadd();
}