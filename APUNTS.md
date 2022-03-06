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

#### Eliminar números repetits:

```
Integer[] wrapper = new Integer[nums.length];
...
Set<Integer> set = new HashSet<Integer>(Arrays.asList(wrapper));
```

## Arrays

#### Ordenar array estàtic
`Arrays.sort(nums);`

#### Clonar array estàtic
`int[] copiedArray = nums.clone();`

#### int[] to Integer[]

`Integer[] list = Arrays.stream( data ).boxed().toArray(Integer[]::new);`

#### int[] to ArrayList<Integer>

`List<Integer> list = Arrays.stream( data ).boxed().collect(Collectors.toList());`

## Strings

#### String to Integer
`String.valueOf(n)`

#### Integer to String
Integer.toString(i)

## Characters
#### Lower Case
`char c1 = Character.toLowerCase(c);`
#### Letter Or Digit
`Character.isLetterOrDigit(c)`




## Queue
`Queue<Integer> queue = new LinkedList<Integer>();`

#### Add element
Inserts the specified element into this queue.

`queue.add(e)`

#### Poll head
Retrieves and removes the head of this queue, or returns null if this queue is empty.

`queue.poll()`

#### Remove head
Retrieves and removes the head of this queue.

`queue.remove()`

#### Peek head
Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

`queue.peek()`



## Stack
`Stack<Integer> stack = new Stack<Integer>()`

#### Empty Stack
Tests if this stack is empty.

`empty()`

#### Peek Stack
Looks at the object at the top of this stack without removing it from the stack.

`peek()`

#### Pop Stack
Removes the object at the top of this stack and returns that object as the value of this function.

`pop()`

#### Push Element
Pushes an item onto the top of this stack.

`push(e)`




## Fibonacci
#### Algorisme Iteratiu
```
public int Fibonacci(int n) {
    int sum = 1;
    int before = 1;
    int aux = 0;

    for (int i = 2; i <= n; i++) {
        aux = sum;
        sum += before;
        before = aux;
    }
    return sum;
}   
```

#### Algorisme Recursiu
```
public int Fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n < 3) {
      return 1;
    } else {
      return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
```

## Random Numbers
`Random randomGenerator = new Random();`


`int random = randomGenerator.nextInt(nums.length);`


#### Seqüència de números aleatoris
```
ArrayList<Integer> randomSequence = new ArrayList<Integer>();   
Random randomGenerator = new Random();

while (randomSequence.size() < nums.length) {
    int random = randomGenerator.nextInt(nums.length);
    if (!randomSequence.contains(random)) {
        randomSequence.add(random);
    }
}
```

## Ternary Operator
`n == 0 ? false : Math.log10(n) / Math.log10(3) % 1 == 0;`


