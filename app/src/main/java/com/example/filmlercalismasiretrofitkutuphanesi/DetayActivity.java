package com.example.filmlercalismasiretrofitkutuphanesi;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class DetayActivity extends AppCompatActivity {
    private ImageView ımageViewFilmResim;
    private TextView textViewFilmAd,textViewYil,textViewYonetmen;
    private Filmler film;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        ımageViewFilmResim = findViewById(R.id.imageViewResim);
        textViewFilmAd = findViewById(R.id.textViewFilmAd);
        textViewYil = findViewById(R.id.textViewYil);
        textViewYonetmen = findViewById(R.id.textViewYonetmen);

        film = (Filmler) getIntent().getSerializableExtra("nesne");

        textViewFilmAd.setText(film.getFilmAd());
        textViewYil.setText(String.valueOf(film.getFilmYil()));
        textViewYonetmen.setText(film.getYonetmen().getYonetmenAd());

        String url = "https://snowpiercer.store/resimler/"+film.getFilmResim();

        Picasso.get().load(url).resize(400,600).into(ımageViewFilmResim);
    }
}
