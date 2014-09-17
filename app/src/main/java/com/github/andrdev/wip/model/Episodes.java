package com.github.andrdev.wip.model;


import java.util.ArrayList;

public class Episodes {
    String id;
    String name;
    String number;
    String air_date;
    String song_count;

    @SuppressWarnings("serial")
    public static class List extends ArrayList<Episodes> {
    }
}
