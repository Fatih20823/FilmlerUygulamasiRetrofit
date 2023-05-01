package com.example.filmlercalismasiretrofitkutuphanesi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface KategorilerDaoInterface {

    @GET("bayrakquiz/tum_filmler_kategoriler.php")
    Call<KategoriCevap> tumKategoriler();
}
