package com.example.manageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import Fragment.ErweimaFragment;
import Fragment.MainFragment;
import Fragment.MeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected LinearLayout mMenumain;
    protected LinearLayout mMenume;
    protected LinearLayout mMenuma;
    protected MainFragment mMainFragment=new MainFragment();    //首页
    protected MeFragment mMeFragment=new MeFragment();          //我的
    protected ErweimaFragment mErweimaFragment=new ErweimaFragment();       //二维码
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            initView();
            //获取管理类
            this.getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container,mMainFragment)
                    .show(mMainFragment)
                    .add(R.id.container,mErweimaFragment)
                    .hide(mErweimaFragment)
                    .add(R.id.container,mMeFragment)
                    .hide(mMeFragment)
                    //事物添加
                    //提交
                    .commit();
        }
        /*
         * 初始化视图
         * */
        public void initView(){
            mMenumain=(LinearLayout) findViewById(R.id.main);
            mMenume= (LinearLayout) findViewById(R.id.my);
            mMenuma=(LinearLayout) findViewById(R.id.ma);
            mMenumain.setOnClickListener(this);
            mMenume.setOnClickListener(this);
            mMenuma.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.main://首页
                    this.getSupportFragmentManager()
                            .beginTransaction()
                            .show(mMainFragment)
                            .hide(mErweimaFragment)
                            .hide(mMeFragment)
                            .commit();
                    break;
                case R.id.my://我的
                    this.getSupportFragmentManager()
                            .beginTransaction()
                            .show(mMeFragment)
                            .hide(mErweimaFragment)
                            .hide(mMainFragment)
                            .commit();
                    break;
                case R.id.ma://二维码
                    this.getSupportFragmentManager()
                            .beginTransaction()
                            .show(mErweimaFragment)
                            .hide(mMainFragment)
                            .hide(mMeFragment)
                            .commit();
                    break;
            }
        }
    }
