package com.oudp.platform;

public class oudpDev
{
    public static boolean FirstName(String str1)
    {
        String firstName = str1;
        if (firstName.isEmpty())
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean LastName(String str1)
    {
        String LastName = str1;
        if (LastName.length() > 5)
        {
            return true;
        }
        else {
            return false;
        }
    }
        public static String FinalName(String str1, String str2)
        {
            String firstName = str1;
            String LastName = str2;
            String FullName = str1 + str2;
            return FullName;
        }


        public static void main(String args[]) {

        }

}
