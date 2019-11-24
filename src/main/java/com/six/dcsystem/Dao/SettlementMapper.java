package com.six.dcsystem.Dao;

import com.six.dcsystem.Bean.Settlement;
import org.apache.ibatis.annotations.Mapper;
import java.util.*;

@Mapper
public interface SettlementMapper {
    int deleteByPrimaryKey(Integer settlementkey);

    int insert(Settlement record);

    int insertSelective(Settlement record);

    Settlement selectByPrimaryKey(String settlementid);

    int updateByPrimaryKeySelective(Settlement record);

    int updateByPrimaryKey(Settlement record);

    //查询全部数据
    List<Settlement> setAll(Settlement settlement);

    //模糊查询
    List<Settlement> limitset(String settlementid);

    //将数据进行归档
    int updatezt(Settlement settlement);
}