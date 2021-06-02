package com.example.alionbing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.alionbing.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding amb =
                DataBindingUtil.setContentView(this,R.layout.activity_main);
        MyViewMode mv = new ViewModelProvider(this, new ViewModelProvider.
                AndroidViewModelFactory(getApplication())).get(MyViewMode.class);
        amb.setUsermode(mv);
        amb.setLifecycleOwner(this);
    }
}