package org.example;

public class Urinals {
    /**
     *
     * @author - Varshith Sriram Mandalapu
     */
    public static boolean checkInput(String str)
    {
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0' || str.charAt(i)=='1')
            {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public void openFile()
    {

    }
    public void countUrinals()
    {

    }
}
