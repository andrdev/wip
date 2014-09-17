package com.github.andrdev.wip.request;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;


public class TuneFind extends RetrofitSpiceRequest {

    public TuneFind(Class clazz, Class retrofitedInterfaceClass) {
        super(clazz, retrofitedInterfaceClass);
    }

    @Override
    public Object loadDataFromNetwork() throws Exception {
        return null;
    }

    @Override
    public int compareTo(Object another) {
        return 0;
    }
}
