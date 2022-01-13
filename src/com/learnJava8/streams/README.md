# Introduction to Streams API

- Introduced in Java8.
- Main purpose is to perform some **Operation on Collections**.
- **Parallel operations** are easy to perform with the Streams API without having to spawn multiple threads.
- Streams can also be used with array, collections or any kind of I/O.

## What is a Stream

- Streams is a sequence of elements which can be created out of collections such as a **List or Arrays** or any kind 
of **I/O** resource.

    
    List<String> names = Arrays.asList("Adam", "Dan", "Jenny");
    names.streams(); // creates a stream
    
- Stream operations can be performed either **sequentially** or **parallel**.


    names.parallelStream(); // creates a parallel stream
    
## How Stream API Works?

Stream Pipeline contains: Output -> Intermediate Operations -> Terminal Operation

## Collections and Streams

|**Collections**|**Streams**|
|---------------|-----------|
|Can add or modify elements at any point of time.<br>For example:<br>```List -> list.add(<element>);```|Cannot add or modify elements in the stream.  It is a fixed data set.|
|Elements in the collection can be accessed in any order. Use appropriate methods based on the collection.<br>For example:<br>```List -> list.get(0)```|Elements in the stream can be accessed only in sequence.|
|Collections are eagerly constructed.|Streams are lazily constructed.|
|Collections can be traversed 'n' number of times.|Streams can be traversed only once|
|Performs **External iteration** to iterate through the elements.|Performs **Internal iteration** to iterate through the elements|

## Stream API: ```map()```

- ```map()``` : Convert(transform) from one type to another.
- do not get confused with the ```Map``` collection type.

@See StreamsMapExample.java

## Stream API: ```flatMap()```

- ```flatMap()```: converts (transforms) one type to another as like ```map()``` method
- Used in the context of Stream where each element in the stream represents multiple elements.
- 
**Example:**
- Each Stream element represents multiple elements.
  - ```Stream<List>```
  - ```Stream<Arrays>```

## Stream API: ```distinct(), count() and sorted()```

- ```distinct()``` - returns a stream with unique elements
- ```count()``` - returns a long with the total no of elements in the stream
- ```sorted()``` - sorts the elements in the stream (using natural ordering)

## Stream API - ```reduce()```

- **reduce** - this is a terminal operation. Used to reduce the contents of a stream to a single value.
- it takes two parameters as inputs:
  - **first parameter** - default ot initial value
  - **second parameter** - ```BinaryOperator<T>```

## Stream API - ```limit()``` and ```skip()```

- These two functions help to create a sub-stream.

- ```limit(n)``` - limits the 'n' numbers of elements to be processed in the stream.
- ```skip(n)``` - skips the 'n' numbers of elements from the stream