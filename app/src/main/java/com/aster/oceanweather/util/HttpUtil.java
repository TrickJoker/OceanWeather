package com.aster.oceanweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String addr, Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(addr).build();
        client.newCall(request).enqueue(callback);
    }
}
