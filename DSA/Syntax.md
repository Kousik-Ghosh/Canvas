
```JAVA
        Arrays.fill(arr,-1);
        arr.clone();
        Arrays.sort(arr);
        Arrays.sort(arr, (first, second) -> first[index] - second[index]);



        char[] arr = s.toCharArray();
        new String(arr);



        StringBuilder sb = new StringBuilder();
        sb.append("hello");



        for(Map.Entry<String, Integer> me : hm.entrySet()){
                me.getKey();
                me.getValue();
        }



        Iterator<Integer> it = arrList.iterator();
        while(it.hasNext()){
                it.next();
        }



        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        Collections.binarySearch(list, element);



        list.stream().filter(listItem -> { return listItem > 50; } ).toList();
        list.stream().sorted((a,b)->{ return a-b; }).toList();
```

