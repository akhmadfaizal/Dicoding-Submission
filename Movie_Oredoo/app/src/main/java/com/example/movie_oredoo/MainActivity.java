package com.example.movie_oredoo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Movies> movies;
    private ListView listMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMovies = findViewById(R.id.List_Film);
        movies = generateMovies();
        MoviesAdapter adapter = new MoviesAdapter(this,movies);
        listMovies.setAdapter(adapter);
        listMovies.setOnItemClickListener(listener);

    }
    AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
            detailIntent.putExtra(DetailActivity.EXTRA_MOVIES, movies.get(position));
            startActivity(detailIntent);
        }
    };

    private static ArrayList<Movies> generateMovies(){
        ArrayList<Movies> ListMovies = new ArrayList<>();

        Movies movies = new Movies();
        movies.setMoviesName("Avenger Infinity War");
        movies.setDescription("As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.");
        movies.setImgResource(R.drawable.poster_avengerinfinity);
        movies.setBgImgResources(R.drawable.bg_avengers);
        movies.setDuration("Duration : 2h 29m");
        ListMovies.add(movies);
        movies = new Movies();
        movies.setMoviesName("Aquaman");
        movies.setDescription("Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.");
        movies.setImgResource(R.drawable.poster_aquaman);
        movies.setBgImgResources(R.drawable.bg_aquaman);
        movies.setDuration("Duration : 2h 24m");
        ListMovies.add(movies);
        movies = new Movies();
        movies.setMoviesName("Deadpool");
        movies.setDescription("Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.");
        movies.setImgResource(R.drawable.poster_deadpool);
        movies.setBgImgResources(R.drawable.bg_deadpool);
        movies.setDuration("Duration : 1h 48m");
        ListMovies.add(movies);
        movies = new Movies();
        movies.setMoviesName("Venom");
        movies.setDescription("Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.");
        movies.setImgResource(R.drawable.poster_venom);
        movies.setBgImgResources(R.drawable.bg_venom);
        movies.setDuration("Duration : 1h 52m");
        ListMovies.add(movies);
        movies = new Movies();
        movies.setMoviesName("Spider-Man: Into the Spider-Verse");
        movies.setDescription("Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson Kingpin Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.");
        movies.setImgResource(R.drawable.poster_spiderman);
        movies.setBgImgResources(R.drawable.bg_spiderman);
        movies.setDuration("Duration : 1h 57m");
        ListMovies.add(movies);
        movies = new Movies();
        movies.setMoviesName("Bird Box");
        movies.setDescription("Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.");
        movies.setImgResource(R.drawable.poster_birdbox);
        movies.setBgImgResources(R.drawable.bg_birdbox);
        movies.setDuration("Duration : 2h 4m");
        ListMovies.add(movies);
        movies = new Movies();
        movies.setMoviesName("Glass");
        movies.setDescription("In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.");
        movies.setImgResource(R.drawable.poster_glass);
        movies.setBgImgResources(R.drawable.bg_glass);
        movies.setDuration("Duration : 2h 9m");
        ListMovies.add(movies);
        movies = new Movies();
        movies.setMoviesName("Bumblebee");
        movies.setDescription("On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.");
        movies.setImgResource(R.drawable.poster_bumblebee);
        movies.setBgImgResources(R.drawable.bg_bumblebee);
        movies.setDuration("Duration : 1h 54m");
        ListMovies.add(movies);
        movies = new Movies();
        movies.setMoviesName("Mortal Engines");
        movies.setDescription("Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.");
        movies.setImgResource(R.drawable.poster_mortalengine);
        movies.setBgImgResources(R.drawable.bg_mortalengines);
        movies.setDuration("Duration : 2h 9m");
        ListMovies.add(movies);
        movies = new Movies();
        movies.setMoviesName("Mary Poppins");
        movies.setDescription("In Depression-era London, a now-grown Jane and Michael Banks, along with Michael's three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives.");
        movies.setImgResource(R.drawable.poster_marrypopins);
        movies.setBgImgResources(R.drawable.bg_marrypoppins);
        movies.setDuration("Duration : 2h 11m");
        ListMovies.add(movies);

        return ListMovies;
    }

}
