package com.company.models;

public class Piece {
    int id;
    String color;
    int x, y, z;

    public Piece(String color, int z, int id){
        this.id = id;
        this.color = color;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = z;
    }
}
