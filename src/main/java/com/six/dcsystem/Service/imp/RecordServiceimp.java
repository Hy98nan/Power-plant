package com.six.dcsystem.Service.imp;

import com.six.dcsystem.Bean.Record;
import com.six.dcsystem.Dao.RecordMapper;
import com.six.dcsystem.Service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceimp implements RecordService {

    @Autowired
    private RecordMapper recordMapper;

    //增加数据
    @Override
    public int recordInsert(Record record) {
        return recordMapper.insertSelective(record);
    }

    //修改数据
    @Override
    public int recordUpdate(Record record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }

    //单条数据的查询
    @Override
    public Record recordSelect(Record record) {
        return recordMapper.selectByPrimaryKey(record.getRecordid());
    }

    //多条数据的查询
    @Override
    public Record recordSelects() {
        System.out.println("进入数据查询");
        return recordMapper.recordSelects();
    }

    //删除数据
    @Override
    public int recordDelete(int id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

}
