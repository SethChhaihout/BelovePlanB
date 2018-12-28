package com.example.chhaihout.beloveplanb.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.chhaihout.beloveplanb.R;
import com.example.chhaihout.beloveplanb.fragment.PhotoFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,new PhotoFragment())
                .commitAllowingStateLoss();
    }
}
