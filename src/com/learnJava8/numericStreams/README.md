## Numeric Streams

Represents the **primitive values** in the stream

- IntStream
- LongStream
- DoubleStream

## Numeric Streams Ranges:

- ```IntStream```

    ```IntStream.range(1,50)``` -> returns an ```IntStream``` of 49 elements from 1 to 49.
  
    ```IntStream.rangeClosed(1,50)``` -> returns an ```IntStream``` of 50 elements from 1 to 50.

- ```LongStream```

    ```LongStream.range(1,50)``` -> returns an ```LongStream``` of 49 elements from 1 to 49.
  
    ```LongStream.rangeClosed(1,50)``` -> returns an ```LongStream``` of 50 elements from 1 to 50.

- ```DoubleStream```
  - does not support ```range()``` and ```rangeClosed()```, see example ```NumericStreamRangesExample``` for work 
  around.

## Numeric Streams Aggregate functions:
- ```sum()```
- ```max()```
- ```min()```
- ```average()```

## Numeric Streams : Boxing() and UnBoxing()

**Boxing():**
- Converting a primitive type to Wrapper class type
  - Converting an int(primitive) to Integer(wrapper)

**UnBoxing():**
- Converting a Wrapper class type to a primitive type
  - Converting an Integer(wrapper) to int(primitive)