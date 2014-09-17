package com.github.andrdev.wip.model;


import java.util.ArrayList;

public class Artists {
    String id;
    String name;

    @SuppressWarnings("serial")
    public static class List extends ArrayList<Artists> {
    }
}
