package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lq on 2018/6/17.basic 的json数据格式如下：
 * {"cid":"CN101200509","location":"武穴","parent_city":"黄冈","admin_area":"湖北","cnty":"中国",
 * "lat":"29.84934235","lon":"115.56242371","tz":"+8.00","city":"武穴","id":"CN101200509",
 * "update":{"loc":"2018-06-17 08:48","utc":"2018-06-17 00:48"}}
 */

public class Basic {
    /**
     * 由于JSON中的一些字段可能不太适合直接作为Java字段来命名，因此用@SerializedName注解的方式
     * 来让Json字段和Java字段建立映射关系
     */

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
