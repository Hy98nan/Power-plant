package com.six.dcsystem.Controller;


import com.six.dcsystem.Bean.BaseSet;
import com.six.dcsystem.Service.BaseSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Api(tags = "baseset")
@CrossOrigin
@RestController
public class BaseSetController {

    @Autowired
    //将service层进行自动装配
    private BaseSetService baseSetService;

    @ApiOperation("多表联查")
    @RequestMapping(value = "/basesetselect",method = RequestMethod.GET)
    public List<BaseSet> basesetselect(){
        return baseSetService.select();
    }

    @ApiOperation("有参数的多表联查")
    @RequestMapping(value = "/basesetsel",method = RequestMethod.GET)
    public List<BaseSet> basesetsel(Integer amid){
        return baseSetService.basesetsel(amid);
    }
}
