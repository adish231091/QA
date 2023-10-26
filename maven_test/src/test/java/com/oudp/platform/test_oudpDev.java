package com.oudp.platform;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class test_oudpDev {

    @Test
    public void TestOUDPDevFinalName()
    {
        System.out.println("Concating FirstName and LastName to generate FullName");
        String str1= "Adish";
        String str2= "Sharma";
        String str3 = str1 + str2;
        assertEquals(str3,oudpDev.FinalName(str1,str2));
    }
    @Test
    public void TestOUDPDevFirstName()
    {
        System.out.println("Checking FirstName is empty Or Not !!!!");
        boolean var= false;
        assertEquals(var,oudpDev.FirstName("   asdsadasd"));
    }

    @Test
    public void TestOUDPDevLastName()
    {
        System.out.println("Checking LastName more than 5 Char's");
        boolean var1= true;
        System.out.println("variable test");
        assertEquals(var1,oudpDev.LastName("SHARMANADISHSDSDSDS12343"));
    }

}
