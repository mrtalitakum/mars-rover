package com.platform45.marsroverchallenge;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Thabang on 2018/04/23.
 */
public class MarsRoverTest {


    @Test
    public void runCommands_givenMCommandAndCurrentOrientationN_shouldAddOneToCurrentY() {
        int x_max = 3;
        int y_max = 3;
        int currentX = 2;
        int currentY = 2;
        Plateau plateau = new Plateau(x_max, y_max);
        MarsRover marsRover = new MarsRover(plateau, currentX, currentY);
        marsRover.runCommands("M");
        Assert.assertEquals(currentY + 1, marsRover.getCurrentY());
    }

    @Test
    public void runCommands_givenMCommandAndCurrentOrientationE_shouldAddOneToCurrentX() {
        int x_max = 3;
        int y_max = 3;
        int currentX = 2;
        int currentY = 2;
        Plateau plateau = new Plateau(x_max, y_max);
        MarsRover marsRover = new MarsRover(plateau, currentX, currentY, "E");
        marsRover.runCommands("M");
        Assert.assertEquals(currentX + 1, marsRover.getCurrentX());
    }


}
