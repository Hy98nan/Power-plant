package com.six.dcsystem.Service.imp;

import com.six.dcsystem.Bean.Statistics;
import com.six.dcsystem.Dao.StatisticsMapper;
import com.six.dcsystem.Service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticsServiceimp implements StatisticsService {

    @Autowired
    private StatisticsMapper statisticsMapper;

    @Override
    public int staInsert(Statistics statistics) {
        return statisticsMapper.insertSelective(statistics);
    }
}
