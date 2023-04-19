# Array
**Simple array of integers.**
```JAVA
        int[] arr = new int[10];
```
**Print Array - no loop.**
```JAVA
        int[] arr = new int[]{3, 61, 82, 7, 88};
        Arrays.toString(arr);
```

**Specific value initializing.**
```JAVA
        Arrays.fill(arr,-1);
```

**Array Cloning.**
```JAVA
        int[] copyOfArray = arr.clone();
```

**Array Sorting 1-D.**
```JAVA
        int[] arr = new int[]{22, 8, 50, 9};
        Arrays.sort(arr);
```

**Array Sorting 2-D.**
```JAVA
        int[][] arr = new int[][]{{5,10,4},{2,5,3},{4,7,99},{3,9,34}};
        Arrays.sort(arr, (first, second) -> first[index] - second[index]);
```

**Array to List.**
```JAVA
        int[] arr = new int[]{34, 32, 55, 77, 4, 100};
        List<Integer> aList = Arrays.asList(arr);
```

# String
**Basic.**
```JAVA
        String s = "Hello World!";
        s.length();
        s.charAt(3);
```

**Sortig.**
```JAVA
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
```

# String Builder
```JAVA
        String s = "Hello World!";
        StringBuilder sb = new StringBuilder(s);
                        OR
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.charAt(index);
        sb.length();        
```

# List
## Array List
```JAVA
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(value);                     // O(1)
        arrList.add(index, value);              // O(N)
        arrList.set(index, value);              // O(1)
        arrList.get(index);                     // O(N)
        arrList.remove(index);                  // O(N)
        arrList.remove(Integr.valueOf(value));  // O(N)
        arrList.size();                         // O(1)
        arrList.clear();                        // O(1)
        arrList.contains(value);                // O(N)

        /* Append new list */  
        List<Integer> arrList2 = new ArrayList<Integer>();
        arrList.addAll(arrList2);

        /* List to Array */  
        int[] s = arrList.toArray(new int[arrList.size()]);  

        /* Sort ArrayList*/
        list.sort((a,b)->{ return a-b; }); 
```

## Stack
```JAVA
        Stack<Integer> s = new Stack<Integer>();
        s.push(value);
        s.pop();
        s.peek();
```

## Linked List
```JAVA
        LinkedList<Integer> ll  = new LinkedList<Integer>();
```
# Queue
## Priority Queue - (For Heap)
```JAVA
        PriorityQueue<Integer> pq  = new PriorityQueue<Integer>();
```
## Array Deque
```JAVA
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
```

# Set - (No Duplicate Element)
## Hash Set - (No Order)
```JAVA
       HashSet<Integer> hs = new HashSet<Integer>(); 
```
## Linked Hash Set - (Order Maintained)
```JAVA
       LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(); 
```
## Tree Set - (BST)
```JAVA
       TreeSet<Integer> ts = new TreeSet<Integer>(); 
```

# Map
## Hash Map
```JAVA
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
```
## Linked Hash Map
```JAVA
        
```
## Tree Map - (BST on Key)
```JAVA
       TreeMap<String, Integer> tm = new TreeMap<String, Integer>(); 
```
## Looping on Map
```Java
        for(Map.Entry<String, Integer> me : hm.entrySet()){
                me.getKey();
                me.getValue();
        }
        for(String key : hm.keySet()){
                System.out.println(key);
        }
        for(Integer value : hm.value()){
                System.out.println(value);
        }
```

# Iterartor
```JAVA
        List<Integer> arrList = new ArrayList<Integer>();
        Iterator<Integer> it = arrList.iterator();
        while(it.hasNext()){
                it.next();
        }
```
# Collection
```JAVA
        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        Collections.binarySearch(list, element);
```

