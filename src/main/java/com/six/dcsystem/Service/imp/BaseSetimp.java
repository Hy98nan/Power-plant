package com.six.dcsystem.Service.imp;

import com.six.dcsystem.Bean.BaseSet;
import com.six.dcsystem.Dao.BaseSetMapper;
import com.six.dcsystem.Service.BaseSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseSetimp implements BaseSetService {

    @Autowired
    //将dao层类注入
    private BaseSetMapper baseSetMapper;

    @Override
    public List<BaseSet> select() {
        return baseSetMapper.select();
    }

    @Override
    public List<BaseSet> basesetsel(Integer ammeterid) {
        return baseSetMapper.basesetsel(ammeterid);
    }
}
