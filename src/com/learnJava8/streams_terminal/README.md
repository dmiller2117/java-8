# Stream Terminal Operations

- Terminal Operations collect the data for you
- Terminal Operations starts the whole stream pipeline
- Terminal Operations:
  - ```forEach()```
  - ```min()```
  - ```max()```
  - ```reduce()```
  - ```collect()``` and etc.

## Terminal Operation - ```collect()```

- The ```collect()``` method takes in an input of type ```Collector```
- Produces the result as per the input passed to the ```collect()```method.

## Terminal Operation - ```joining()```

- ```joining()``` Collector performs the String concatenation on the elements in the stream
- ```joining()``` has 3 different overloaded methods