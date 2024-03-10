/* https://leetcode.com/problems/time-based-key-value-store/ */

class TimeMap {
    class Pair{
        String v;
        int t;
        Pair(String value, int ts){
            v = value;
            t = ts;
        }
    }    
    static HashMap<String, List<Pair>> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(hm.containsKey(key)){
            List<Pair> list = hm.get(key);
            list.add(new Pair(value, timestamp));
            hm.put(key,list);
        }else{
            List<Pair> li = new ArrayList<Pair>();
            li.add(new Pair(value, timestamp));
            hm.put(key, li);
        }
    }
    
    public String get(String key, int timestamp) {
    
        List<Pair> list = hm.get(key);

        if(list == null || list.isEmpty()){
            return "";
        }
        
        int left = 0;
        int right = list.size()-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(list.get(mid).t == timestamp){
                return list.get(mid).v;
            }
            if(list.get(mid).t < timestamp){
                left = mid+1;
            }else{
                right = mid-1;
            }
            
        }
        if(right<0){
            right = 0;
        }
        return list.get(right).t < timestamp ? list.get(right).v : "";


    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */








