package com.example.movie_oredoo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIES = "extra_movies";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();

        Movies movies = getIntent().getParcelableExtra(EXTRA_MOVIES);

        if(movies != null){
            ImageView imgMov = findViewById(R.id.imgMovi);
            imgMov.setImageResource(movies.getImgResource());
            imgMov.setScaleType(ImageView.ScaleType.CENTER_CROP);

            TextView txtMov = findViewById(R.id.text_mov_name);
            txtMov.setText(movies.getMoviesName());

            TextView txtdesc = findViewById(R.id.text_mov_description);
            txtdesc.setText(movies.getDescription());

            ImageView bg_poster = findViewById(R.id.bg_poster);
            bg_poster.setImageResource(movies.getBgImgResources());
            bg_poster.setScaleType(ImageView.ScaleType.CENTER_CROP);


        }
    }

    private void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
