package com.aboutview.ui;

import android.os.Bundle;

import com.aboutview.R;
import com.aboutview.view.weather.WeatherView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WeatherActivity extends AppCompatActivity {

    @BindView(R.id.weatherView)
    WeatherView weatherView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.weatherView)
    public void onClick() {
        weatherView.startAnim();
    }
}
