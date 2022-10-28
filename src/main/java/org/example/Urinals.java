package org.example;

public class Urinals {
    /**
     *
     * @author - Varshith Sriram Mandalapu
     */

    private Integer count=0;
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
    public static boolean validateInput(String str)
    {
      for (int i=0;i<str.length();i++)
      {
          if(i==0 && str.charAt(i)=='1')
          {
              if(str.charAt(i+1)=='1')
              {
                  return false;
              }
          }
          else if(i==str.length()-1 && str.charAt(i)=='1')
          {
              if(str.charAt(i-1)=='1')
              {
                  return false;
              }
          }
          else{
              if(str.charAt(i)=='1')
              {
                  if(str.charAt(i-1)=='1' || str.charAt(i+1)=='1')
                  {
                      return false;
                  }
              }
          }
      }
        return true;
    }
    public void countUrinals()
    {

    }
}
