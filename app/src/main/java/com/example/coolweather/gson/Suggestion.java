package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lq on 2018/6/17.
 * {"comf":{"type":"comf","brf":"较不舒适","txt":"白天天气多云，同时会感到有些热，不很舒适。"},
 * "sport":{"type":"sport","brf":"较适宜","txt":"天气较好，较适宜进行各种运动，但因天气热，请适当减少运动时间，降低运动强度。"},
 * "cw":{"type":"cw","brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"}}
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("sport")
    public Sport sport;

    @SerializedName("cw")
    public CarWash carWash;


    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
}
