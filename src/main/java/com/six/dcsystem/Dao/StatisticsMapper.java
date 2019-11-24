package com.six.dcsystem.Dao;

import com.six.dcsystem.Bean.Statistics;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StatisticsMapper {
    int deleteByPrimaryKey(String statisticsid);

    int insert(Statistics record);

    int insertSelective(Statistics record);

    Statistics selectByPrimaryKey(String statisticsid);

    int updateByPrimaryKeySelective(Statistics record);

    int updateByPrimaryKey(Statistics record);
}