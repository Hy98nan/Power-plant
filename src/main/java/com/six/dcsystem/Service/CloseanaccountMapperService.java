package com.six.dcsystem.Service;

import com.six.dcsystem.Bean.Closeanaccount;
import java.util.*;

public interface CloseanaccountMapperService {

    //增加数据
    int cloInsert(Closeanaccount closeanaccount);

    //修改数据
    int cloUpdate(Closeanaccount closeanaccount);

    //查询数据
    Closeanaccount cloSelect(int id);

    //查询所有数据
    List<Closeanaccount> cloSelects(Closeanaccount closeanaccount);

    //删除数据
    int cloDelete(int id);

    //多表联查
    List<Closeanaccount> closetSelect(Closeanaccount closeanaccount);
}
