package com.g.kousik;

import java.util.HashMap;

public class Hunter {
    HashMap<String, String> oHm = new HashMap<>();

    void insertoHm(String key, String value){
        oHm.put(key, value);
    }

    String findoHm(String Key){
        return  oHm.get(Key);
    }


}
