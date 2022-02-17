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