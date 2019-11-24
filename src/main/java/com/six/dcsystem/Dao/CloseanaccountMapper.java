package com.six.dcsystem.Dao;

import com.six.dcsystem.Bean.Closeanaccount;
import org.apache.ibatis.annotations.Mapper;
import java.util.*;
@Mapper
public interface CloseanaccountMapper {
    int deleteByPrimaryKey(Integer zhujian);

    int insert(Closeanaccount record);

    int insertSelective(Closeanaccount record);

    Closeanaccount selectByPrimaryKey(Integer zhujian);

    int updateByPrimaryKeySelective(Closeanaccount record);

    int updateByPrimaryKey(Closeanaccount record);

    //查询所有数据
    List<Closeanaccount> cloSelects(Closeanaccount closeanaccount);

    //多表联查
    List<Closeanaccount> colsetSelect(Closeanaccount closeanaccount);

}