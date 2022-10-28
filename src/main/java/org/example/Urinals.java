package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Urinals {
    /**
     *
     * @author - Varshith Sriram Mandalapu
     */

    static ArrayList<Integer> output= new ArrayList<>();
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
            return -1;
        }
        return count;
    }

    public static void readInput(String fileName) throws FileNotFoundException, EmptyFileException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        if(!scanner.hasNextLine())
        {
            throw new EmptyFileException("EmptyInput");
        }
        while (scanner.hasNextLine()) {
              String s = scanner.nextLine();
              Integer result= countUrinals(s);
              output.add(result);
            }
    }

    public void writeOutput(String path) throws IOException, EmptyFileException {
        readInput(path);
        String outPutFileName = "rule.txt";
        File files = new File(".");
        List<String> outputFiles = Arrays.stream(files.listFiles()).map(file -> file.getName())
                .filter(name -> name.matches("rule.*.txt")).sorted().collect(Collectors.toList());
        if (!outputFiles.isEmpty()) {
            String maxLength = outputFiles.get(outputFiles.size() - 1);
            String numVal = maxLength.substring(4, maxLength.length() - 4);
            if (numVal.length() > 0)
                outPutFileName = String.format("rule%d.txt", Integer.parseInt(numVal) + 1);
            else
                outPutFileName = "rule1.txt";
            }
            FileWriter fw = new FileWriter(outPutFileName);
            for (int i = 0; i < output.size(); i++) {
                fw.write(output.get(i).toString());
                fw.write(System.getProperty( "line.separator" ));
            }
            fw.close();
        }
}
