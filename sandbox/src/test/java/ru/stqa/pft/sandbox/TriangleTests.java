package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTests {

    @Test
    public void testArea(){
        Triangle t = new Triangle(5,6);
        Assert.assertEquals(t.area(),15);
    }

}
