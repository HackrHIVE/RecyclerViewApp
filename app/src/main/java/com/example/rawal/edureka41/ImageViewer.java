package com.example.rawal.edureka41;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class ImageViewer extends AppCompatActivity {

    String imageURL,location,artist,infoData;
    TextView locationShow,artistShow,infoShow;
    ImageView imageToShow;
    ProgressBar progressBarViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_image_viewer );

        locationShow = findViewById( R.id.locationToShowViewer );
        artistShow = findViewById( R.id.artistToShowViewer );
        infoShow = findViewById( R.id.infoToShowViewer );
        imageToShow = findViewById( R.id.imageViewer );
        progressBarViewer = findViewById( R.id.progress_bar_imageViewer );

        imageURL = getIntent().getStringExtra( "imgURL" );
        location = getIntent().getStringExtra( "locationImage" );
        infoData = getIntent().getStringExtra( "infoImage" );
        artist = getIntent().getStringExtra( "artistImage" );

        Glide.with(this)
                .load( imageURL )
                .listener( new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        Toast.makeText( ImageViewer.this, "Internet Connection Problem", Toast.LENGTH_SHORT ).show();
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        artistShow.setText( "By "+artist );
                        locationShow.setText( "Location : "+location );
                        infoShow.setText( infoData );
                        progressBarViewer.setVisibility( View.INVISIBLE );
                        return false;
                    }
                } )
                .into( imageToShow );
    }
}
