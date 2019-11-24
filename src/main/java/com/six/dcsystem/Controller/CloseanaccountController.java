package com.six.dcsystem.Controller;

import com.six.dcsystem.Bean.Closeanaccount;
import com.six.dcsystem.Service.CloseanaccountMapperService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin
@Api("Closeanaccount")
@RestController
public class CloseanaccountController {

    @Autowired
    private CloseanaccountMapperService closeanaccountMapperService;

    @ApiOperation("增加数据")
    @RequestMapping(value = "/colinsert",method = RequestMethod.PUT)
    public int cloInsert(@RequestBody Closeanaccount closeanaccount){
        return closeanaccountMapperService.cloInsert(closeanaccount);
    }

    @ApiOperation("修改数据")
    @RequestMapping(value = "/cloinsert",method = RequestMethod.PUT)
    public int cloUpdate(@RequestBody Closeanaccount closeanaccount){
        return closeanaccountMapperService.cloUpdate(closeanaccount);
    }

    @ApiOperation("单条数据查询")
    @RequestMapping(value = "/closelect",method = RequestMethod.PUT)
    public Closeanaccount cloSelect(int id){
        return closeanaccountMapperService.cloSelect(id);
    }

    @ApiOperation("查询所有数据")
    @RequestMapping(value = "/closelects",method = RequestMethod.GET)
    public List<Closeanaccount> cloSelects(Closeanaccount closeanaccount){
        return closeanaccountMapperService.cloSelects(closeanaccount);
    }

    @ApiOperation("删除数据")
    @RequestMapping(value = "/clodelete",method = RequestMethod.PUT)
    public int cloDelete(int id){
        return closeanaccountMapperService.cloDelete(id);
    }

    @ApiOperation("多表联查")
    @RequestMapping(value = "/setcolSelect",method = RequestMethod.PUT)
    public List<Closeanaccount> setcolSelect(Closeanaccount closeanaccount){
        System.out.println("电表编号："+closeanaccount.getSettlement().getAmmeterid());
        return closeanaccountMapperService.closetSelect(closeanaccount);
    }
}
