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

        
        // hunter.setTTL(5, 10000);
        // hunter.setTTL("kousik", 20000);
        // hunter.setTTL(1.5, 7000);
      

        // for (int i = 1; i <= 25; i++) {
        //     System.out.println(i);
        //     System.out.println(hunter.get(5));
        //     System.out.println(hunter.get("kousik"));
        //     System.out.println(hunter.get(1.5));
        //     System.out.println("-----------");

        //     try {
        //         Thread.sleep(1000);
        //         } catch(Exception e){}
        // }


        System.out.println(hunter.listPush("friends", "joey"));
        System.out.println(hunter.listPush("friends", "feebs"));
        System.out.println(hunter.listPush("friends", "rachel"));
        System.out.println(hunter.get("friends").toString());

        hunter.setTTL("friends", 7000);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.println(hunter.get("friends"));
            System.out.println("-----------");

            try {
                Thread.sleep(1000);
                } catch(Exception e){}
            }
     


    }
}