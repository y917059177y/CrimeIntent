package com.example.administrator.crimeintent;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class CrimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        // 获取FragmentManager
        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction() // FragmentTransaction - Fragment事务被用来添加，移除，附加，分离，替换fragment
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
