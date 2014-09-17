package com.github.andrdev.wip.network;

import com.github.andrdev.wip.model.Artists;
import com.github.andrdev.wip.model.Episodes;
import com.github.andrdev.wip.model.Movies;
import com.github.andrdev.wip.model.Seasons;
import com.github.andrdev.wip.model.Shows;
import com.github.andrdev.wip.model.Songs;

import retrofit.http.GET;
import retrofit.http.Path;


public interface TuneFind {

    @GET("/artist/{artist}")
    Artists.List artists(@Path("artist") String artist);

    @GET("/movie/{movie}")
    Movies.List movies(@Path("movie") String movie);

    @GET("/show/{show}")
    Seasons.List shows(@Path("show") String show);

    @GET("/show/{show}/season-{season}")
    Episodes.List seasons(@Path("show") String show, @Path("season") String season);

    @GET("/show/{show}/season-{season}/{episode}")
    Songs.List episodes(@Path("episode") String episode);

}
