package com.aboutview.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.aboutview.R;
import com.aboutview.viewgroup.scrollgroup.ChildScrollLayoutChangeListener;
import com.aboutview.viewgroup.scrollgroup.MyChildVerticalScrollLayout;
import com.aboutview.viewgroup.scrollgroup.MyParentVerticalScrollLayout;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewGroupActivity extends AppCompatActivity {

    @BindView(R.id.image_refresh)
    View imageRefresh;
    @BindView(R.id.tv_refresh)
    TextView tvRefresh;
    @BindView(R.id.mChildScrollLayout)
    MyChildVerticalScrollLayout mChildScrollLayout;
    @BindView(R.id.mParentScrollLayoutView)
    MyParentVerticalScrollLayout mParentScrollLayoutView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_group);
        ButterKnife.bind(this);
        mChildScrollLayout.addChangeListener(new ChildScrollLayoutChangeListener() {
            @Override
            public void doChange(int lastIndex, int currentIndex) {

            }

            @Override
            public void onReadyRefresh() {

            }

            @Override
            public void onReady() {

            }

            @Override
            public void doRefresh() {

            }

            @Override
            public void overRefresh() {

            }
        });
    }
}
