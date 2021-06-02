package com.dongnaoedu.navigation3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void go2main(View view) {
        Intent intent = new Intent("com.alion.test.999");
        Bundle bundle = new Bundle();
        bundle.putString("name","www.dongnaoedu.com/123");
        startActivity(intent);
    }
}