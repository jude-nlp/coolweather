package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS1 on 2017/11/12.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{    //c小写啊  SB
        @SerializedName("loc")
                public String updateTime;
    }
}
