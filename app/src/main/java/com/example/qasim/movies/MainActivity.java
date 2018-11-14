package com.example.qasim.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.qasim.movies.controller.MovieController;
import com.example.qasim.movies.model.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> movielist=new ArrayList<>();

        movielist.add(new Movie("https://720p-izle.com/i/afis/a6527.jpg","Gorevimiz tehlike","2017"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a6670.jpg","Christopher robin","2015"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a6674.jpg","Dehşetin yüzü","2018"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a6432.jpg","Gokdelen","2018"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a6625.jpg","Incredibles 2","2018"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a6352.jpg","Paddington 2","2018"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a6474.jpg","Gizli gorev","2018"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a6098.jpg","Ready play one","2018"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a6130.jpg","Tomb Raider","2018"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a5331.jpg","Dangal","2018"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a6399.jpg","Deadpool 2","2018"));
        movielist.add(new Movie("https://720p-izle.com/i/afis/a6654.jpg","Adalaet 2 - The Equalizer 2","2016"));


        MovieController movieController=new MovieController(movielist,this);
        RecyclerView recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(movieController);
    }
}
