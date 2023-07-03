/* https://leetcode.com/problems/design-hashset/description/ */

class MyHashSet {

    static int maxRow = 10000;
    static ArrayList<ArrayList<Integer>> hs;
    public MyHashSet() {
        hs = new ArrayList<>(maxRow);
        for(int i = 0; i < maxRow; i++){
            hs.add(new ArrayList<Integer>());
        }
    }
    
    public void add(int key) {
        
        int hash = calculateHash(key);
        if(hs.get(hash).size() == 0){
            hs.get(hash).add(key);
        }else{
            ArrayList<Integer> temp = hs.get(hash);
            for(Integer x : temp){
                if(x == key){
                    return;
                }
            }
            hs.get(hash).add(key);
        }

    }
    
    public void remove(int key) {
        int hash = calculateHash(key);
        if(hs.get(hash).size() == 0){
            return;
        }else{
            ArrayList<Integer> temp = hs.get(hash);
            int pos = temp.indexOf(key);
            if(pos == -1){
                return;
            }else{
                hs.get(hash).remove(pos);
            }
            
        }
    }
    
    public boolean contains(int key) {
        int hash = calculateHash(key);
        if(hs.get(hash).size() == 0){
            return false;
        }else{
            ArrayList<Integer> temp = hs.get(hash);
            int pos = temp.indexOf(key);
            if(pos == -1){
                return false;
            }else{
                return true;
            }
            
        }
    }

    public static int calculateHash(int key){
        return key % maxRow;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */