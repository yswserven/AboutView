package com.aboutview.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aboutview.R;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_wave, R.id.bt_pieChart, R.id.bt_dataView, R.id.bt_progress, R.id.bt_lineChart, R.id.bt_antsCredit, R.id.bt_password,
            R.id.bt_viewGroup, R.id.bt_flowLayout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_wave:
                startActivity(new Intent(MainActivity.this, WaveViewActivity.class));
                break;
            case R.id.bt_pieChart:
                startActivity(new Intent(MainActivity.this, PieChartActivity.class));
                break;
            case R.id.bt_dataView:
                startActivity(new Intent(MainActivity.this, DataViewActivity.class));
                break;
            case R.id.bt_progress:
                startActivity(new Intent(MainActivity.this, ProgressBarActivity.class));
                break;
            case R.id.bt_lineChart:
                startActivity(new Intent(MainActivity.this, LineChartActivity.class));
                break;
            case R.id.bt_antsCredit:
                startActivity(new Intent(MainActivity.this, AntsCreditActivity.class));
                break;
            case R.id.bt_password:
                startActivity(new Intent(MainActivity.this, PasswordActivity.class));
                break;
            case R.id.bt_viewGroup:
                startActivity(new Intent(MainActivity.this, ViewGroupActivity.class));
                break;
            case R.id.bt_flowLayout:
                startActivity(new Intent(MainActivity.this, FlowLayoutActivity.class));
                break;
        }

    }
}

