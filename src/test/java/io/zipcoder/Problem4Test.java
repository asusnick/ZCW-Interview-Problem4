package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class Problem4Test {

    Problem4 problem4 = new Problem4();

    @Test
    public void winterIsComingYesTest() {
        String expected = "YES";
        String actual = problem4.winterIsComing("aaabbbb");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void winterIsComingNoTest() {
        String expected = "NO";
        String actual = problem4.winterIsComing("cdefghmnopqrstuvw");
        Assert.assertEquals(expected,actual);
    }
}
