package com.pam.mypets;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;



public interface ApiInterface {

    @POST("get_pets.php")
    Call<List<Pets>> getPets();

    @FormUrlEncoded
    @POST("add_pet.php")
    Call<Pets> insertPet(
            @Field("key") String key,
            @Field("varietas") String varietas,
            @Field("no_soliter") String no_soliter,
            @Field("is_aduan") int is_aduan,
            @Field("tgl_pembelian") String tgl_pembelian,
            @Field("harga_beli") String harga_beli,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("update_pet.php")
    Call<Pets> updatePet(
            @Field("key") String key,
            @Field("id") int id,
            @Field("varietas") String varietas,
            @Field("no_soliter") String no_soliter,
            @Field("is_aduan") int is_aduan,
            @Field("tgl_pembelian") String tgl_pembelian,
            @Field("harga_beli") String harga_beli,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("delete_pet.php")
    Call<Pets> deletePet(
            @Field("key") String key,
            @Field("id") int id,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("update_love.php")
    Call<Pets> updateLove(
            @Field("key") String key,
            @Field("id") int id,
            @Field("love") boolean love);

}
