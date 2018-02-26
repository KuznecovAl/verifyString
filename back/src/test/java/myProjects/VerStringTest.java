package myProjects;


import org.junit.Assert;

public class VerStringTest

{
    @org.junit.Test
    public void returnPhone() {

        Assert.assertEquals(VerString.testString("+375297515313"), "phone");


    }


}



