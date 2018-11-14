package com.example.qasim.movies.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qasim.movies.R;
import com.example.qasim.movies.model.Movie;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MovieController extends RecyclerView.Adapter {

    private ArrayList<Movie> movies;
    private Context context;

    public MovieController(ArrayList<Movie> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.item_movie,viewGroup,false);
        return new MovieView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Movie currentMovie=movies.get(i);
        MovieView movieView= (MovieView) viewHolder;
       // movieView.imageView.setImageResource(currentMovie.getIcon());
        Picasso.get().load(currentMovie.getImageUrl()).into(movieView.imageView);
        movieView.textView.setText(currentMovie.getName()+" - "+currentMovie.getYear());

    }

    @Override
    public int getItemCount() {
        if (movies==null){
            return 0;
        }
        return movies.size();
    }

    private class MovieView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public MovieView(@NonNull View view) {
            super(view);
            imageView=view.findViewById(R.id.img_movie);
            textView=view.findViewById(R.id.txt_movie);
        }
    }
}
