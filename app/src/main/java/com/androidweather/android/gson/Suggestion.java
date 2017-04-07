package com.androidweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/6.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort confort;

    @SerializedName("cw")
    public Carwash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class Carwash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
