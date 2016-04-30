package com.example.administrator.crimeintent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Administrator on 2016/4/30.
 * Fragment
 */
public class CrimeFragment extends Fragment {

    private Crime mCrime;
    private EditText mTitleField;

    /**
     * onCreate是public的，可以被托管的Activity调用
     *
     * @param savedInstanceState 保存Fragment的状态
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, container, false);

        mTitleField = (EditText) v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() { // 添加文本监听器
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCrime.setTitle(s.toString()); // 将mCrime的标题设为输入的内容
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return v;
    }
}
