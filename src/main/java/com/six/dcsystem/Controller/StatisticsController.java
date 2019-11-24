package com.six.dcsystem.Controller;

import com.six.dcsystem.Bean.Statistics;
import com.six.dcsystem.Service.StatisticsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("statistics")
@RestController
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @ApiOperation("增加数据")
    @RequestMapping(value = "/stainsert",method = RequestMethod.PUT)
    public int staInsert(@RequestBody Statistics statistics){
        return statisticsService.staInsert(statistics);
    }
}
