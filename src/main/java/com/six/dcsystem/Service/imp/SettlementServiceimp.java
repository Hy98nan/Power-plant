package com.six.dcsystem.Service.imp;

import com.six.dcsystem.Bean.Settlement;
import com.six.dcsystem.Dao.SettlementMapper;
import com.six.dcsystem.Service.SettlementService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettlementServiceimp implements SettlementService {

    @Autowired
    private SettlementMapper settlementMapper;

    //单条数据的查询
    @Override
    public Settlement sel(String settlementid) {
        System.out.println("进入单条数据的查询方法");
        return  settlementMapper.selectByPrimaryKey(settlementid);
    }

    /*多条数据的查询
    @Override
    public List<Settlement> add(@RequestBody Settlement settlement) {
        System.out.println("进入多条数据的查询方法");
        return settlementMapper.selectByExample(settlement);
    }*/

    //删除数据
    @Override
    public int del(Integer settlementkey) {
        System.out.println("进入删除方法"+settlementkey);
        int deltemp = 0;
        if(settlementkey==null){
            deltemp = -2;
            System.out.println("删除的主键不能为空");
        }else{
            //判断传入的字段类型是否与数据库类型一致

            //根据传入值查询是否有与其对应的核对编号

            deltemp = settlementMapper.deleteByPrimaryKey(settlementkey);
        }
        return deltemp;
    }

    //修改数据
    @Override
    public int upd(Settlement settlement) {
        System.out.println("进入修改方法");
        int updtemp = 0;
        if(settlement.getSettlementkey()==null){
            System.out.println("修改的主键为："+settlement.getSettlementkey());
            updtemp = -2;
            System.out.println("修改的主键不能为空");
        }else{
            updtemp = settlementMapper.updateByPrimaryKeySelective(settlement);
        }
        return updtemp;
    }

    //新增数据
    @Override
    public int ins(Settlement settlement) {
        System.out.println("进入新增方法");
        //判断主要信息不能为空
        int instemp = 0;
        if(settlement.getSettlementid()==null){
            System.out.println("电表结算编号(Settlementid)不能为空");
            instemp = -2;
        }else if(settlement.getAmmeterid()==null){
            instemp = -3;
            System.out.println("电表编号(Ammeterid)不能为空");
        }else if(settlement.getAmmeternnum()==null){
            System.out.println("上次电表数(Ammeternnum)不能为空");
            instemp = -4;
        }else{
            //判断信息是否重复
            System.out.println("编号"+settlement.getSettlementid());
            Settlement count = settlementMapper.selectByPrimaryKey(settlement.getSettlementid());
            System.out.println(count);
            if(count==null){
                System.out.println("不存在编号，允许进行添加信息");
                instemp = settlementMapper.insertSelective(settlement);
                //判断本月初的电表数与上月末的电表数是否一致
            }else{
                //编号重复
                System.out.println("存在编号，不允许进行添加信息");
                instemp = -1;
            }
        }
        return instemp;
    }

    //查询全部数据
    @Override
    public List<Settlement> setAdd(Settlement settlement) {
        System.out.println("进入全部数据查询方法");
        return settlementMapper.setAll(settlement);
    }

    //模糊查询
    @Override
    public List<Settlement> limitset(String settlementid) {
        return settlementMapper.limitset(settlementid);
    }

    //数据进行归档
    @Override
    public int updatezt(Settlement settlement) {
        return settlementMapper.updatezt(settlement);
    }
}
