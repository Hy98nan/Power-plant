package com.six.dcsystem.Controller;

import com.six.dcsystem.Bean.Basestation;
import com.six.dcsystem.Service.BasestationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@Api(tags = "basestation")
@RestController
public class BasestationController {

    @Autowired
    private BasestationService basestationService;

    @ApiOperation("数据插入")
    @RequestMapping(value = "/baseinsert",method = RequestMethod.POST)
    public int baseinsert(@RequestBody Basestation basestation){
        System.out.println("联系人"+basestation.getInstallingcontacts());
        return basestationService.baseinsert(basestation);
    }

    @ApiOperation("数据的删除")
    @RequestMapping(value = "/basedelete",method = RequestMethod.DELETE)
    public int basedelete(int id){
        return basestationService.basedelete(id);
    }

    //精确查询
    @ApiOperation("数据查询")
    @RequestMapping(value = "/baseselect",method = RequestMethod.GET)
    public Basestation baseselect(int id){
        return basestationService.baseselect(id);
    }

    @ApiOperation("修改数据")
    @RequestMapping(value = "/baseupdate",method = RequestMethod.PUT)
    public int baseupdate(@RequestBody Basestation basestation){
        return basestationService.baseupdate(basestation);
    }

    @ApiOperation("查询全部数据")
    @RequestMapping(value = "/baseadd",method = RequestMethod.GET)
    public List<Basestation> baseadd(Basestation basestation){
        return basestationService.BaseAdd(basestation);
    }

    //模糊查询
    @ApiOperation("根据地址模糊查询")
    @RequestMapping(value = "/likesle",method = RequestMethod.GET)
    public List<Basestation> likesel(String dz){
        return basestationService.likeDizhi(dz);
    }

    //根据日期区间进行查询
    @ApiOperation("日期区间的查询")
    @RequestMapping(value = "/Timequjian",method = RequestMethod.GET)
    public List<Basestation> Timequjian(Date start,Date end){
        return basestationService.Timequjian(start,end);
    }

}
