package com.aboutview.ui;

import android.os.Bundle;
import android.widget.Button;

import com.aboutview.R;
import com.aboutview.view.WaveView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WaveViewActivity extends AppCompatActivity {

    @BindView(R.id.waveView)
    WaveView waveView;
    @BindView(R.id.bt_change)
    Button btChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave_view);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bt_change)
    public void onClick() {
        waveView.setPercent(new Random().nextInt(100));
    }
}
