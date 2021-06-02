package com.example.alionbing;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewMode extends ViewModel {
    private static final String TAG = "alionlog";

    public MutableLiveData<String> getTestnum() {
        Log.d(TAG, "getTestnum: "+testnum);
        return testnum;
    }

    public void setTestnum(MutableLiveData<String> testnum) {
        Log.d(TAG, "setTestnum: "+testnum);
        this.testnum = testnum;
    }

    private MutableLiveData<String> testnum = new MutableLiveData<>();

}
