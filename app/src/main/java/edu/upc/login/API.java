package edu.upc.login;



import android.media.session.MediaSession;

import java.util.List;

import edu.upc.login.Entidades.Partida;
import edu.upc.login.Entidades.Ranking;
import edu.upc.login.Entidades.Token;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface API {

@GET("game/ranking")
    Call <List<Ranking>> getRanking();

@GET("game/puntosPlayer ")
    Call<List<Partida>> getRankingPersonal(@Body String token);

@POST("auth/login")
    Call<Token> login(@Body LoginCredentials loginCredentials);

@POST("auth/register")
    Call<Token> register(@Body RegisterCredentials registerCredentials);

}