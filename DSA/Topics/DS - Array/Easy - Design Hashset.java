import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyHashSet {

    private int totalBuckets = 1000;
    private List<List<Integer>> buckets;
    public MyHashSet() {
        buckets = new ArrayList<>(totalBuckets);
        for (int i = 0; i < totalBuckets; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    private int hash(int key){
        return key % totalBuckets;
    }
    
    public void add(int key) {
        int hash = hash(key);
        List<Integer> specificBucket = buckets.get(hash);
        if (!specificBucket.contains(key)) {
            specificBucket.add(key);
        }
    }
    
    public void remove(int key) {
        int hash = hash(key);
        List<Integer> specificBucket = buckets.get(hash);
        specificBucket.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int hash = hash(key);
        List<Integer> specificBucket = buckets.get(hash);
        if (specificBucket.contains(key)) {
            return true;
        }
        return false;
    }
}