package com.six.dcsystem.Service;

import com.six.dcsystem.Bean.Settlement;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SettlementService {

//    单条数据查询
    public Settlement sel(String settlementid);

    /*多条数据的查询
    public List<Settlement> add(Settlement settlement);*/

//    数据删除
    int del(Integer settlementkey);

//    数据修改
    int upd(Settlement settlement);

//    插入数据
    int ins(Settlement settlement);

    //查询所有数据
    List<Settlement> setAdd(Settlement settlement);

    //模糊传查询
    List<Settlement> limitset(String settlementid);

    //进行归档处理
    int updatezt(Settlement settlement);

}
