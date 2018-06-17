package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lq on 2018/6/17.
 * {"cloud":"43","cond_code":"100","cond_txt":"晴","fl":"28","hum":"65","pcpn":"0.0",
 * "pres":"1004","tmp":"27","vis":"20","wind_deg":"94","wind_dir":"东风","wind_sc":"3",
 * "wind_spd":"12","cond":{"code":"100","txt":"晴"}}
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
