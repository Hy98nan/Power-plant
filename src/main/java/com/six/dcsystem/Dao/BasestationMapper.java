package com.six.dcsystem.Dao;

import com.six.dcsystem.Bean.Basestation;
import org.apache.ibatis.annotations.Mapper;
import java.util.*;

//将dao层与mapper.xml进行连接
@Mapper//会在编译的时候生成相应的实现类
public interface BasestationMapper {
    //单条数据的插入
    int insert(Basestation record);

    //插入所有数据
    int insertSelective(Basestation record);

    //单条数据查询
    Basestation selectByPrimaryKey(int id);

    //模糊查询
    List<Basestation> likeDizhi(String dz);

    //数据的删除
    int deleteByPrimaryKey(int id);

    //单条数据修改
    int updateByPrimaryKeySelective(Basestation basestation);

    //所有数据修改
    int updateByPrimaryKey(Basestation basestation);

    //根据电表编号进行查询
    Basestation selectAmmeterid(int id);

    //查询所有数据
    List<Basestation> BaseAdd(Basestation basestation);

    //日期区间的查询
    List<Basestation> Timequjian(Date start,Date end);
}