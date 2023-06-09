package com.example.filmlercalismasiretrofitkutuphanesi;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface FilmlerDaoInterface {

    @POST("bayrakquiz/tum_filmler_by_kategori_id.php")
    @FormUrlEncoded
    Call<FilmlerCevap> tumFilmlerByKategoriID(@Field("kategori_id") int kategori_id);
}
