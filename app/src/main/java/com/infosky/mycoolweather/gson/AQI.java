package com.infosky.mycoolweather.gson;

/**
 * Created by PineChang on 2016/12/29.
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        //如果和json中的属性名相同,可以不写@SerializedName注释
        public String aqi;
        public String pm25;
    }
}
