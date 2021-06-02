package com.dongnaoedu.databinding4;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author ningchuanqi
 * @version V1.0
 */
public class UserViewModel extends ViewModel {

    public String getUserName() {
        Log.d("alionlog", "getUserName: "+userName.getValue());
        return userName.getValue();
    }

    public void setUserName(String userName) {
        Log.d("alionlog", "setUserName: "+userName);
        this.userName.postValue(userName);
    }

    public MutableLiveData<String> userName = new MutableLiveData<>();


}
