package com.six.dcsystem.Service.imp;

import com.six.dcsystem.Bean.Closeanaccount;
import com.six.dcsystem.Dao.CloseanaccountMapper;
import com.six.dcsystem.Service.CloseanaccountMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class CloseanaccountMapperServiceimp implements CloseanaccountMapperService {

    @Autowired
    private CloseanaccountMapper closeanaccountMapper;

    //增加数据
    @Override
    public int cloInsert(Closeanaccount closeanaccount) {
        return closeanaccountMapper.insertSelective(closeanaccount);
    }

    //修改数据
    @Override
    public int cloUpdate(Closeanaccount closeanaccount) {
        return closeanaccountMapper.updateByPrimaryKeySelective(closeanaccount);
    }

    //单条数据的查询
    @Override
    public Closeanaccount cloSelect(int id) {
        return closeanaccountMapper.selectByPrimaryKey(id);
    }

    //多条数据的查询
    @Override
    public List<Closeanaccount> cloSelects(Closeanaccount closeanaccount) {
        return closeanaccountMapper.cloSelects(closeanaccount);
    }

    //删除数据
    @Override
    public int cloDelete(int id) {
        return closeanaccountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Closeanaccount> closetSelect(Closeanaccount closeanaccount) {
        return closeanaccountMapper.colsetSelect(closeanaccount);
    }
}
