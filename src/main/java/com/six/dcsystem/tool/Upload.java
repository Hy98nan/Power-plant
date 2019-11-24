package com.six.dcsystem.tool;

import java.io.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

public class Upload {
    @PostMapping("/upload")
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile) throws IOException {
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
        return  null;
    }
}
