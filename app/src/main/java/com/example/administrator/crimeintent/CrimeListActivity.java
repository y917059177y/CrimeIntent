package com.example.administrator.crimeintent;

import android.app.Fragment;

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
