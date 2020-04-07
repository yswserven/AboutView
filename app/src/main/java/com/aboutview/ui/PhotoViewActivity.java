package com.aboutview.ui;

import android.os.Bundle;

import com.aboutview.R;
import com.aboutview.view.photoview.PhotoView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class PhotoViewActivity extends AppCompatActivity {

    @BindView(R.id.photoView)
    PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_view);
        ButterKnife.bind(this);
        photoView.setImageResource(R.mipmap.img1);
    }
}
