# What is a Lambda Expression:

- **Lambda** is equivalent to a function (method) without a name
- **Lambda's** are also referred to as ***Anonymous functions***
    - method parameter
    - method body
    - return type
- **Lambda's** are not tied to any class like a regular method
- **Lambda's** can also be assigned to a variable and passed around

## Syntax of the Lambda expression

    () -> {}

- `()` input parameters
- `->` lambda arrow
- `{}` lambda body

# Usages of Lambdas

- Mainly used to implement Functional interfaces (SAM: Single Abstract Method)


    @FunctionalInterface 
    public interface Comparator<T> { 
        int compare(T1, T2); 
    };

    @FunctionalInterface 
    public interface Runnable { 
        public abstract void run(); 
    };
    
## New Functional Interfaces with Java 8

- `Consumer`
- `Predicate`
- `Function`
- `Supplier`

And their extensions:
- `Consumer` -> `BiConsumer`
- `Predicate` -> `BiPredicate`
- `Function` -> `BiFunction, UnaryOperator, BinaryOperator`