package com.example.filmlercalismasiretrofitkutuphanesi;

public class ApiUtils {

    public static final String BASE_URL = "https://snowpiercer.store/";

    //bu base link ana link olmalı alt kolları interface içerisinde belirtilir.

    public static FilmlerDaoInterface getFilmlerDaoInterface() {
        return RetrofitClient.getClient(BASE_URL).create(FilmlerDaoInterface.class);
    }

    public static KategorilerDaoInterface getKategorilerDaoInterface() {
        return RetrofitClient.getClient(BASE_URL).create(KategorilerDaoInterface.class);
    }
}


