package org.example;

import java.io.File;

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
    public static Integer countUrinals(String str1)
    {
        Integer count =0;
        boolean checkString= checkInput(str1);
        boolean validateString= validateInput(str1);
        StringBuffer str= new StringBuffer(str1);
        if(checkString==true && validateString==true)
        {
            for(int i=0;i<str.length();i++)
            {
                if (i==str.length()-1 )
                {
                    if(str.charAt(i-1)=='0' && str.charAt(i)=='0')
                    {
                        count++;
                        str.deleteCharAt(i);
                        str.insert(i,'1');
                    }
                }
                else{
                    if(str.charAt(i)=='0' && i==0)
                    {
                        if(str.charAt(i+1)=='0')
                        {
                            count++;
                            str.deleteCharAt(i);
                            str.insert(i,'1');
                        }
                    }
                    else {
                        if(str.charAt(i)=='0')
                        {
                            if(str.charAt(i-1)=='0' && str.charAt(i+1)=='0')
                            {
                                count++;
                                str.deleteCharAt(i);
                                str.insert(i,'1');
                            }
                        }
                    }
                }
            }
        }
        else {
            return 0;
        }
        if(count==0)
        {
            return -1;
        }
        return count;
    }

    public void readInput(File input)
    {

    }

    public void writeOutput(Integer count)
    {

    }
}
