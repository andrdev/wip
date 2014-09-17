package com.github.andrdev.wip.model;


import java.util.ArrayList;

public class Movies {
    String id;
    String name;
    String air_date;

    @SuppressWarnings("serial")
    public static class List extends ArrayList<Movies> {
    }
}
