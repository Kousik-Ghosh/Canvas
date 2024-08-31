package com.g.kousik;

public class App 
{
    public static void main( String[] args )
    {
        Hunter hunter = new Hunter();

        hunter.insertoHm("KK", "LL");
        hunter.insertoHm("Kousik", "Ghosh");
        System.out.println(hunter.findoHm("KK"));
        System.out.println(hunter.findoHm("Kousik"));


    }
}