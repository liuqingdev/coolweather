package com.example.coolweather.gson;

/**
 * Created by lq on 2018/6/17.
 * {"city":{"aqi":"76","pm25":"51","qlty":"良"}}
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
