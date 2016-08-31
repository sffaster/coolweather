package com.sf.coolweather.util;

/**
 * Created by sf on 16-8-31.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
