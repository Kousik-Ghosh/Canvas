/* https://leetcode.com/problems/design-hashmap/description/ */

class Pair{
    int key;
    int value;
    Pair(int x, int y){
        key = x;
        value = y;
    }
}

class MyHashMap {

    static int maxRows = 10000;
    static ArrayList<ArrayList<Pair>> hm;
    public MyHashMap() {
        hm = new ArrayList<>(maxRows);
        for(int i = 0; i < maxRows; i++){
            hm.add(new ArrayList<Pair>());
        }
    }
    
    public void put(int key, int value) {
        int hash = calculateHash(key);
        if(hm.get(hash).size() == 0){
            hm.get(hash).add(new Pair(key, value));
        }else{
            Pair t = null;
            ArrayList<Pair> temp = hm.get(hash);
            for(Pair x : temp){
                if(x.key == key){
                    t = x;
                    //hm.get(hash).remove(new Pair(x.key, x.value));
                }
            }
            if(t != null){
                hm.get(hash).remove(t);
            }
            hm.get(hash).add(new Pair(key, value));
        }
    }
    
    public int get(int key) {
        int hash = calculateHash(key);
        if(hm.get(hash).size() == 0){
            return -1;
        }else{
            ArrayList<Pair> temp = hm.get(hash);
            for(Pair x : temp){
                if(x.key == key){
                    return x.value;
                }
            }
            return -1;
        }
        
    }
    
    public void remove(int key) {
        int hash = calculateHash(key);
        if(hm.get(hash).size() == 0){
            return;
        }else{
            Pair t = null;
            ArrayList<Pair> temp = hm.get(hash);
            for(Pair x : temp){
                if(x.key == key){
                    t = x;
                }
            }
            hm.get(hash).remove(t);
        }
    }

    public static int calculateHash(int key){
        return key % maxRows;
    }

    
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */