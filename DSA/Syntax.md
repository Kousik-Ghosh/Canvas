
```JAVA
        
        Arrays.sort(arr);
        Arrays.sort(arr, (first, second) -> first[index] - second[index]);
        Arrays.sort(arr, (a, b)->a[0]==b[0]? a[1]-b[1]:a[0]-b[0]);



        char[] arr = s.toCharArray();
        new String(arr);



        StringBuilder sb = new StringBuilder();
        sb.append("hello");


        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        Collections.binarySearch(list, element);



        list.stream().filter(listItem -> { return listItem > 50; } ).toList();
        list.stream().sorted((a,b)->{ return a-b; }).toList();
```

