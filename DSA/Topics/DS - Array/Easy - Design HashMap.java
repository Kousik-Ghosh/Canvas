import java.util.*;

class MyHashMap {

    int size;
    List<List<Pair>> buckets;
    public MyHashMap() {
        size = 1000;
        buckets = new LinkedList<>();
        for(int i = 0; i < size; i++){
            buckets.add(new LinkedList<Pair>());
        }
    }
    
    int hash(int key){
        return key % size;
    }

    public void put(int key, int value) {
        Pair p = new Pair(key, value);
        int hash = this.hash(key);
        List<Pair> bucket = buckets.get(hash);
        for(Pair b : bucket){
            if(b.key == key){
                bucket.remove(b);
                bucket.add(p);
                return;
            }
        }
        bucket.add(p);
    }
    
    public int get(int key) {
        int hash = this.hash(key);
        List<Pair> bucket = buckets.get(hash);
        for(Pair b : bucket){
            if(b.key == key){
                return b.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int hash = this.hash(key);
        List<Pair> bucket = buckets.get(hash);
        for(Pair b : bucket){
            if(b.key == key){
                bucket.remove(b);
                return;
            }
        }
    }
}

class Pair{
    int key;
    int value;

    Pair(int x, int y){
        key = x;
        value = y;
    }
}