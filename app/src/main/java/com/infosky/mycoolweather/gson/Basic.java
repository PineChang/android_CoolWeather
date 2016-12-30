package com.infosky.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PineChang on 2016/12/29.
 */
public class Basic {
    @SerializedName("city")
    public  String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
