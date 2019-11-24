package com.six.dcsystem.Dao;

import com.six.dcsystem.Bean.BaseSet;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface BaseSetMapper {

    //查询全部数据
    List<BaseSet> select();

    //有参数的多表联查
    List<BaseSet> basesetsel(Integer amid);
}
