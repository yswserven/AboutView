package com.aboutview.ui;

import android.os.Bundle;
import android.view.View;

import com.aboutview.R;
import com.aboutview.view.AntsCreditView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AntsCreditActivity extends AppCompatActivity {

    @BindView(R.id.antsCreditView)
    AntsCreditView antsCreditView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ants_credit);
        ButterKnife.bind(this);
    }

    public void changeData(View view) {
        antsCreditView.setYswCurrentNum(new Random().nextInt(900));
    }
}
