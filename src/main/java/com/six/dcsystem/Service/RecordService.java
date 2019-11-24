package com.six.dcsystem.Service;

import com.six.dcsystem.Bean.Record;
import org.omg.CORBA.INTERNAL;

public interface RecordService {

    //插入数据
    int recordInsert(Record record);

    //修改数据
    int recordUpdate(Record record);

    //单条数据的查询
    Record recordSelect(Record record);

    //多条数据的查询
    Record recordSelects();

    //删除数据
    int recordDelete(int id);
}
