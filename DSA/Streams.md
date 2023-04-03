# Filter
```JAVA
        list.stream().filter(listItem -> { return listItem > 50; } ).toList();
```

# Sort
```JAVA
        list.stream().sorted((a,b)->{ return a-b; }).toList();
```

# AllMatch
```JAVA
        list.stream().allMatch(listItem -> listItem > 0)
```

# AnyMatch
```JAVA
        list.stream().anyMatch(listItem -> listItem == 0);
```

# NoneMatch
```JAVA
        list.stream().noneMatch(listItem -> listItem < 0);
```

# Min
```JAVA
        Optional<Integer> min  = list.stream().max((a,b)->{ return a-b; });
        System.out.println(min.get());
```

# Max
```JAVA
        Optional<Integer> max  = list.stream().max((a,b)->{ return a-b; });
        System.out.println(max.get());
```