package com.g.kousik;

import java.util.ArrayList;
import java.util.LinkedList;

public class App 
{
    public static void main( String[] args )
    {
        Hunter hunter = new Hunter();

       hunter.insert(5, "hunter");
       hunter.insert("kousik", "Ghosh");
       hunter.insert(1.5, 25);

      hunter.setTTL(5, 10000);
      hunter.setTTL("kousik", 20000);
      hunter.setTTL(1.5, 7000);

    //   hunter.insertListFirst("friends", "joey");
    //   hunter.insertListLast("friends", "chandler");
      

      for (int i = 1; i <= 25; i++) {
        System.out.println(i);
        System.out.println(hunter.get(5));
        System.out.println(hunter.get("kousik"));
        System.out.println(hunter.get(1.5));
        System.out.println("-----------");

        try {
            Thread.sleep(1000);
            } catch(Exception e){}
      }

    }
}