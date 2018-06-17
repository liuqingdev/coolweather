package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lq on 2018/6/17.
 * [{"date":"2018-06-17","cond":{"txt_d":"多云"},"tmp":{"max":"31","min":"25"}},
 * {"date":"2018-06-18","cond":{"txt_d":"多云"},"tmp":{"max":"32","min":"25"}},
 * {"date":"2018-06-19","cond":{"txt_d":"中雨"},"tmp":{"max":"30","min":"25"}}]
 */

public class Forecast {
    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;


    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature{
        public String max;
        public String min;
    }
}
