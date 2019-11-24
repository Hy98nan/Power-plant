package com.six.dcsystem.Controller;

import com.six.dcsystem.Bean.Settlement;
import com.six.dcsystem.Service.SettlementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@Api(tags = "settlement")
@RestController
public class SettlementController {

    @Autowired
    private SettlementService settlementService;

    @ApiOperation("单条数据的查询")
    @RequestMapping(value = "/selectByPrimaryKey",method = RequestMethod.GET)
    public Settlement select(@RequestBody String settlementid){
        return  settlementService.sel(settlementid);
    }

    /*@ApiOperation("多条数据查询")
    @RequestMapping(value = "/addsettlememt",method = RequestMethod.PUT)
    public List<Settlement> add(@RequestBody Settlement settlement){
        List list = settlementService.add(settlement);
        return list;
    }*/

    @ApiOperation("删除数据")
    @RequestMapping(value = "/deletesettlement",method = RequestMethod.DELETE)
    public int delete(Integer settlementkey){
        return settlementService.del(settlementkey);
    }

    @ApiOperation("修改数据")
    @RequestMapping(value = "/updatesettlement",method = RequestMethod.POST)
    public int update(@RequestBody Settlement settlement){
        System.out.println(settlement.getSettlementkey());
        return settlementService.upd(settlement);
    }

    @ApiOperation("新增数据")
    @RequestMapping(value = "/insertsettlement",method = RequestMethod.PUT)
    public int insert(@RequestBody Settlement settlement){
        System.out.println("---"+settlement.getAmmeterid());
        return settlementService.ins(settlement);
    }

    @ApiOperation("查询全部数据")
    @RequestMapping(value = "/setadd",method = RequestMethod.GET)
    public List<Settlement> setAdd(Settlement settlement){
        System.out.println("====="+settlement.getSettlementid()+"====="+settlement.getZt());
        return settlementService.setAdd(settlement);
    }

    //模糊查询
    @ApiOperation("模糊查询")
    @RequestMapping(value = "/limitselect",method = RequestMethod.GET)
    public List<Settlement> limitselect(String settlementid){
        return settlementService.limitset(settlementid);
    }

    //进行归档处理
    @ApiOperation("进行归档")
    @RequestMapping(value = "/updatezt",method = RequestMethod.POST)
    public int updatezt(@RequestBody Settlement settlement){
        return settlementService.updatezt(settlement);
    }


    //文件的上传
    @PostMapping("/upload")
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        System.out.println("进入文件上传方法"+multipartFile.getOriginalFilename());
        //获取图片的原始文件名
        String originaName = multipartFile.getOriginalFilename();
        //指定上传地址
        String realpath = "D:\\io\\";
        /**
         * 为了处理出现重名现象，将原始文件名删除，
         * 通过UUID算法生成新的文件名
         */
        String uuidName = UUID.randomUUID().toString();
        //将uuid名称添加上文件的后缀名
        String newFile = uuidName + originaName.substring(originaName.lastIndexOf("."));
        //创建File文件
        File f = new File(realpath + newFile);
        //将图片写到具体的位置
        multipartFile.transferTo(f);

        String str = "";
        if(!f.exists()){
            str = "文件上传失败";
        }else{
            str = "文件上传成功";
        }
        return  str;
    }
}
