package com.lambton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    }
}
