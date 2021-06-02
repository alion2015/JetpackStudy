package com.dongnaoedu.livedata2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

/**
 * @author ningchuanqi
 * @version V1.0
 */
public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> progress;

    public MutableLiveData<List<Integer>> getAprogress() {
        return aprogress;
    }

    private MutableLiveData<List<Integer>> aprogress= new MutableLiveData<>();

    public void setAprogress(List<Integer> ap) {
        if(null==aprogress){
            aprogress=new MutableLiveData<List<Integer>>();
        }
        aprogress.setValue(ap);
    }

    public MutableLiveData<Integer> getProgress() {
        if(progress == null){
            progress = new MutableLiveData<>();
            progress.setValue(0);
        }
        return progress;
    }
}
