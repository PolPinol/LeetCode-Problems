# Apunts Java - LeetCode Problemes



## HashMap

`HashMap<String, String> map = new HashMap<String, String>();`



#### Add an Item

`map.add(key, value)`



#### Access an Item

`value = map.get()`



#### Remove an Item

`map.remove(key)`



#### Get Keys

```

for (String i : map.keySet()) {

  System.out.println(i);

}

```



#### Get Values

```

for (String i : map.values()) {

  System.out.println(i);

}

```



#### Keys to ArrayList

`ArrayList<String> listOfKeys = map.keySet().stream().collect(Collectors.toCollection(ArrayList::new));`



`new ArrayList(map.keySet())`



#### Values to ArrayList

`ArrayList<Integer> listOfValues = map.values().stream().collect(Collectors.toCollection(ArrayList::new));`



`new ArrayList(map.values())`

  

## HashSet



`Set<Integer> set = new HashSet<Integer>();`



#### Iterar en HashSet




```
