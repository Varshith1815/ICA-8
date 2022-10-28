package org.example;

public class Urinals {
    /**
     *
     * @author - Varshith Sriram Mandalapu
     */

    private static Integer count=0;
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
    public static Integer countUrinals(String str)
    {
        boolean checkString= checkInput(str);
        boolean validateString= validateInput(str);
        if(checkString==true && validateString==true)
        {
            for(int i=0;i<str.length();i++)
            {
                if (i==str.length()-1 )
                {
                    if(str.charAt(i-1)=='0' && str.charAt(i)=='0')
                    {
                        count++;
                    }
                }
                else{
                    if(str.charAt(i)=='0' && i==0)
                    {
                        if(str.charAt(i+1)=='0')
                        {
                            count++;
                        }
                    }
                    else {
                        if(str.charAt(i)=='0')
                        {
                            if(str.charAt(i-1)=='0' && str.charAt(i+1)=='0')
                            {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        if(count==0)
        {
            return -1;
        }
        return count;
    }
}
