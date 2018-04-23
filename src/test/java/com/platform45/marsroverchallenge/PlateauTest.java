package com.platform45.marsroverchallenge;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Thabang on 2018/04/23.
 */
public class PlateauTest {
    @Test
    public void constructor_givenMaximumXY_shouldSetMaximumXY() {
        int x_max = 3;
        int y_max = 3;
        Plateau plateau = new Plateau(x_max, y_max);
        Assert.assertEquals(x_max, plateau.getMaximumX());
        Assert.assertEquals(y_max, plateau.getMaximumY());
    }
}
