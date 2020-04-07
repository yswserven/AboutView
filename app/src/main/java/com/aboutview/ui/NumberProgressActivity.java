package com.aboutview.ui;

import android.os.Bundle;
import android.widget.Toast;

import com.aboutview.R;
import com.aboutview.view.numberprogress.NumberProgressBar;
import com.aboutview.view.numberprogress.OnProgressBarListener;

import java.util.Timer;
import java.util.TimerTask;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class NumberProgressActivity extends AppCompatActivity implements OnProgressBarListener {
    @BindView(R.id.numberbar1)
    NumberProgressBar numberbar1;
    @BindView(R.id.numberbar2)
    NumberProgressBar numberbar2;
    @BindView(R.id.numberbar3)
    NumberProgressBar numberbar3;
    @BindView(R.id.numberbar4)
    NumberProgressBar numberbar4;
    @BindView(R.id.numberbar5)
    NumberProgressBar numberbar5;
    @BindView(R.id.numberbar6)
    NumberProgressBar numberbar6;
    @BindView(R.id.numberbar7)
    NumberProgressBar numberbar7;
    @BindView(R.id.numberbar8)
    NumberProgressBar numberbar8;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_progress);
        ButterKnife.bind(this);
        numberbar1 = findViewById(R.id.numberbar1);
        numberbar1.setOnProgressBarListener(this);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> numberbar1.incrementProgressBy(1));
            }
        }, 1000, 100);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }

    @Override
    public void onProgressChange(int current, int max) {
        if (current == max) {
            Toast.makeText(getApplicationContext(), "结束了", Toast.LENGTH_SHORT).show();
            numberbar1.setProgress(0);
        }
    }
}
