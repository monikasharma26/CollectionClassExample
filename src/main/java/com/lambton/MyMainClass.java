package com.lambton;

import java.util.*;

public class MyMainClass
{
    public static void main(String[] args) {
        //insert string at paticular index
        //delete
        //return index of
        //size of sting
        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("Canada");
        countryList.add("India");
        for (String name : countryList) {
            System.out.println(name);
        }
countryList.add(1,"NY");
        countryList.set(1,"Test");

        for (int i = 0; i < countryList.size(); i++)
        {
            System.out.println(countryList.get(i));
        }
        List c= new ArrayList<String>();
        HashSet<String> hs= new HashSet<>();
        hs.add("SSS");
        hs.add("jdjds");
        hs.add("SSS12");
        hs.add("jdjds22");
        for (String s: hs)
        {
            System.out.println(s);
        }
        HashMap<String,String > hasj1= new HashMap<>();
        hasj1.put("1","2323");
        hasj1.put("2","SSS");
        hasj1.put(null,"test");
        hasj1.put(null,null);
      for(Map.Entry<String, String> country : hasj1.entrySet())
      {
          System.out.println(country.getKey() + "-" + country.getValue());
      }

    }
}
