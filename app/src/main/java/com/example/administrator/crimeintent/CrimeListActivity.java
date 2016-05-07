package com.example.administrator.crimeintent;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2016/5/2.
 * Controller
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
