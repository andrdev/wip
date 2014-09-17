package com.github.andrdev.wip.model;


import java.util.ArrayList;

public class Songs {
    String id;
    String name;
    String confidence;
    String scene;
    Artists artist;

    @SuppressWarnings("serial")
    public static class List extends ArrayList<Songs> {
    }
}
