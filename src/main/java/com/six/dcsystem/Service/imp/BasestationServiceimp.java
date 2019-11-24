package com.six.dcsystem.Service.imp;

import com.six.dcsystem.Bean.Basestation;
import com.six.dcsystem.Dao.BasestationMapper;
import com.six.dcsystem.Service.BasestationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

//识别Service
@Service
public class BasestationServiceimp implements BasestationService {

    @Autowired
    private BasestationMapper basestationMapper;

    //单条数据的插入（根据传入的值进行数据的插入）
    @Override
    public int baseinsert(Basestation basestation) {
        System.out.println("进入增加方法");
        int basetemp = 0;
        //判断不为空
        if(basestation.getBasestationlocation()==null || basestation.getBasestationlocation()=="" ||basestation.getInstallationtime()==null || basestation.getAmmeterid()==null){
            System.out.println("必要数据存在空值，增加失败！");
            basetemp = -2;
        }else{
            //判断传入的值是否重复
            Basestation setstr = basestationMapper.selectAmmeterid(basestation.getAmmeterid());
            System.out.println(setstr);
            if(setstr==null){
                System.out.println("电表编号不重复，可以进行增加");
                basetemp = basestationMapper.insertSelective(basestation);
            }else{
                System.out.println("电表编号重复，不允许增加");
                basetemp = -3;
            }
        }
        return basetemp;
    }

    /**
     * 模糊查询
     * @param dz
     * @return
     */
    @Override
    public List<Basestation> likeDizhi(String dz) {
        System.out.println("进行模糊查询方法，查询的关键字为"+dz);
        return basestationMapper.likeDizhi(dz);
    }

    //删除数据
    @Override
    public int basedelete(int id) {
        System.out.println("进入删除方法"+id);
        int deltemp = 0;
        if(id <1){
            System.out.println("电表编号不能小于1");
            deltemp = -2;
        }else{
            deltemp = basestationMapper.deleteByPrimaryKey(id);
        }
        return deltemp;
    }

    //单条数据查询
    @Override
    public Basestation baseselect(int id) {
        System.out.println("进入单条数据的查询方法");
        Basestation seltemp = null;
        if(id<1){
            System.out.println("查询方法时，传入的参数不能小于1");
        }else{
            seltemp = basestationMapper.selectByPrimaryKey(id);
        }
        if(seltemp == null){
            System.out.println("该编号不存在，未查询到任何信息");
        }
        return seltemp;
    }

    //修改数据
    @Override
    public int baseupdate(Basestation basestation) {
        System.out.println("进入修改数据方法");
        int updtemp = 0;
        if(basestation.getBasestationid() == null){
            System.out.println("未输入电表编号");
        }

        return basestationMapper.updateByPrimaryKeySelective(basestation);
    }

    //查询全部数据
    @Override
    public List<Basestation> BaseAdd(Basestation basestation) {
        System.out.println("进入全部查询方法");
        return basestationMapper.BaseAdd(basestation);
    }

    //根据日期区间进行过查询
    @Override
    public List<Basestation> Timequjian(Date start, Date end) {
        return basestationMapper.Timequjian(start,end);
    }
}
