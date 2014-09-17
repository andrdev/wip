package com.github.andrdev.wip.model;


import java.util.ArrayList;

public class Seasons {
    String id;
    String name;
    String number;
    String episode_count;
    String song_count;

    @SuppressWarnings("serial")
    public static class List extends ArrayList<Seasons> {
    }
}
