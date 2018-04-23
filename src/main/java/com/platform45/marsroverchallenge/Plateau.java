package com.platform45.marsroverchallenge;

/**
 * Created by Thabang on 2018/04/23.
 */
public class Plateau {
    private int x_max = 0;
    private int y_max = 0;

    public Plateau(int x_maximum, int y_maximum) {
        this.x_max = x_maximum;
        this.y_max = y_maximum;
    }

    public int getMaximumX() {
        return x_max;
    }

    public int getMaximumY() {
        return y_max;
    }
}
