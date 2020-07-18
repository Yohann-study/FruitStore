package com.yohann.utils;

import org.apache.commons.lang.RandomStringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Images {
    /**图片路径*/
    public static final String SAVE_PATH = "src/main/webapp/resource/upload/images";
    public static final String GET_PATH = "/resource/upload/images";

    /**
     * 获取文件扩展名
     * @param filename
     * @return
     */
    public static String getExtName(String filename) {
        int index = filename.lastIndexOf(".");

        if (index == -1) {
            return null;
        }
        String result = filename.substring(index);
        return result;
    }

    /**
     * 随机生成名字
     * @return
     */
    public static String rename(){
        //系统时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

        //随机字符+系统时间
        return RandomStringUtils.randomAlphanumeric(5) + simpleDateFormat.format(date);
    }
}