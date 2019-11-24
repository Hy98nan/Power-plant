package com.six.dcsystem.Service;

import com.six.dcsystem.Bean.Basestation;
import java.util.*;


public interface BasestationService {

    //单条数据的插入
    int baseinsert(Basestation basestation);

    //模糊查询
    List<Basestation> likeDizhi(String dz);

    //删除数据
    int basedelete(int id);

    //查询
    Basestation baseselect(int id);

    //修改数据
    int baseupdate(Basestation basestation);

    //查询所有数据
    List<Basestation> BaseAdd(Basestation basestation);

    //日期区间的查询
    List<Basestation> Timequjian(Date start,Date end);
}
