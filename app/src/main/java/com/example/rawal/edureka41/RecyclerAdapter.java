package com.example.rawal.edureka41;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    Context context;
    int resource;
    static ArrayList<SampleData> objects;

    RecyclerAdapter(Context context, int resource, ArrayList<SampleData> objects){
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( context ).inflate( resource,viewGroup,false );
        ViewHolder viewHolder = new ViewHolder( view );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int position) {

        final SampleData obj = objects.get( position );

        Glide.with(context)
                .load(obj.imageID)
                .listener( new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        Toast.makeText( context, "Internet Connection Problem", Toast.LENGTH_SHORT ).show();
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        viewHolder.creditedArtist.setText( "By "+obj.creditedArtist );
                        viewHolder.progressBar.setVisibility( View.INVISIBLE );
                        return false;
                    }
                } )
                .into(viewHolder.imageView);

        viewHolder.parentCard.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( context,ImageViewer.class );
                intent.putExtra( "imgURL", objects.get( position ).imageID);
                intent.putExtra( "locationImage", objects.get( position ).imageLocation);
                intent.putExtra( "infoImage",objects.get( position ).imageInfo );
                intent.putExtra( "artistImage",objects.get( position ).creditedArtist );
                context.startActivity(intent);
            }
        } );
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView creditedArtist;
        ProgressBar progressBar;
        CardView parentCard;

        public ViewHolder(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.imageView );
            creditedArtist = itemView.findViewById( R.id.creditsToArtist );
            progressBar = itemView.findViewById( R.id.progress_bar );
            parentCard = itemView.findViewById( R.id.parent );
        }
    }
}
