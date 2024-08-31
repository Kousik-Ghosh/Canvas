package com.g.kousik;

import java.util.HashMap;

public class Hunter<T> {
    private HashMap<T, T> hashStore = new HashMap<>();
    
    /**
     * Associates the specified value with the specified key.
     * If the map previously contained a mapping for the key, the old
     * value is replaced.
     *
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with {@code key}, or
     *         {@code null} if there was no mapping for {@code key}.
     */
    T insert(T key, T value){
        return hashStore.put(key, value);
    }

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     */
    T get(T Key){
        return hashStore.get(Key);
    }

      /**
     * Removes the mapping for the specified key, if present.
     *
     * @param  key key whose mapping is to be removed from the map
     * @return the previous value associated with {@code key}, or
     *         {@code null} if there was no mapping for {@code key}.
     */
    T delete(T key){
        return hashStore.remove(key);
    }

    void setTTL(T key, int miliSeconds) {
        TimeToLive ttl = new TimeToLive(key, miliSeconds, this);
        ttl.startTTL();
    }



    


}
