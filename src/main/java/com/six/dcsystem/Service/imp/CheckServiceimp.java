package com.six.dcsystem.Service.imp;

import com.six.dcsystem.Bean.Check;
import com.six.dcsystem.Dao.CheckMapper;
import com.six.dcsystem.Service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckServiceimp implements CheckService {

    @Autowired
    private CheckMapper checkMapper;

    //单条数据的插入
    @Override
    public int cheinsert(Check check) {
        System.out.println("进入单条数据的插入方法");
        return checkMapper.insertSelective(check);
    }

    //数据的删除
    @Override
    public int chedelete(int id) {
        System.out.println("进入数据的删除方法");
        int chetemp = 0;
        if(id<1){
            System.out.println("主键不能小于1");
            chetemp = -2;
        }else{
            Check sta = state(id);
            if(sta.getState().equals("归档")){
                System.out.println("该数据已归档，禁止删除");
            }else if(!sta.getState().equals("归档")){
                chetemp = checkMapper.deleteByPrimaryKey(id);
            }
        }
        return chetemp;
    }

    //单条数据库的查询
    @Override
    public Check cheselect(int id) {
        System.out.println("进入单条数据的查询方法");
        Check chetemp = null;
        if(id <1){
            System.out.println("查询的主键不能小于1");
        }else{
            chetemp =  checkMapper.selectByPrimaryKey(id);

            if(chetemp==null){
                System.out.println("没有查找到对应的数据");
            }
        }
        return chetemp;
    }

    //根据输入的数据进行修改方法
    @Override
    public int cheUpdate(Check check) {
        //定义返回值
        int cehtemp = 0;
        System.out.println("进入单条数据的修改方法");
        /*Check zt = checkMapper.selecteZt(check.getCheckkey());*/
        Check zt = state(check.getCheckkey());
        //打印当前信息的状态
        System.out.println("状态："+zt.getState());
        //判断当前信息的状态
        if(!zt.getState().equals("归档")){
            cehtemp = checkMapper.updateByPrimaryKeySelective(check);
        }else if(zt.getState().equals("归档")){
            System.out.println("数据已归档，不允许修改");
        }
        return cehtemp;
    }

    //查询所有数据
    @Override
    public Check cheadd() {
        return checkMapper.cheadd();
    }


    //查询状态信息
    public Check state(int id){
        Check sta = checkMapper.selecteZt(id);
        return sta;
    }
}
