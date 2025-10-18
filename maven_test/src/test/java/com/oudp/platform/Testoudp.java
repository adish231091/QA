package com.oudp.platform;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class Testoudp {
    @Test
    public void TestOUDPDevFirstName()
    {
        System.out.println("Checking FirstName is empty Or Not !!!!");
        boolean var= false;
        assertEquals(var,oudpDev.FirstName("   asdsadasd"));
    }

}
