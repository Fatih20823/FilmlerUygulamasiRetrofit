package com.example.filmlercalismasiretrofitkutuphanesi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilmlerActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView filmlerRv;
    private ArrayList<Filmler> filmlerArrayList;
    private FilmlerAdapter adapter;
    private Kategoriler kategori;
    private FilmlerDaoInterface filmlerDaoInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filmler);

        toolbar = findViewById(R.id.toolbar);
        filmlerRv = findViewById(R.id.filmlerRv);

        kategori = (Kategoriler) getIntent().getSerializableExtra("kategoriNesne");

        filmlerDaoInterface = ApiUtils.getFilmlerDaoInterface();

        toolbar.setTitle(kategori.getKategoriAd());
        setSupportActionBar(toolbar);

        filmlerRv.setHasFixedSize(true);
        filmlerRv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        filmlerDaoInterface.tumFilmlerByKategoriID(Integer.parseInt(kategori.getKategoriId())).enqueue(new Callback<FilmlerCevap>() {
            @Override
            public void onResponse(Call<FilmlerCevap> call, Response<FilmlerCevap> response) {
                List<Filmler> filmler = response.body().getFilmler();

                adapter = new FilmlerAdapter(FilmlerActivity.this,filmler);

                filmlerRv.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<FilmlerCevap> call, Throwable t) {

            }
        });

    }
}

