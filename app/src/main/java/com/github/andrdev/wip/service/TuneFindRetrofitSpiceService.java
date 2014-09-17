package com.github.andrdev.wip.service;

import com.github.andrdev.wip.network.TuneFind;
import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;


public class TuneFindRetrofitSpiceService extends RetrofitGsonSpiceService {
    private final static String BASE_URL = "https://www.tunefind.com/api/v1/";
    @Override
    public void onCreate() {
        super.onCreate();
        addRetrofitInterface(TuneFind.class);
    }

    @Override
    protected String getServerUrl() {
        return BASE_URL;
    }
}
