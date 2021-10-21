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

## Lambdas and local variables

What is a local variable:
- Any variable that is declared inside a method body is called a local variable.

Lambdas have some restrictions on using local variables.
- Not allowed to use the same name as the **lambda parameter** or inside the **lambda body**
- Not allowed **re-assign** a value to a local variable

No restrictions on **instance** variables

### Effectively final

- Lambda's are allowed to use local variables but not allowed to modify it, even though it was not declared final.
  - This is called **effectively final**
- Not allowed to modify the value in the lambda.

    
    int value = 4;
    Consumer <Integer> c1 = (a) -> {
        // value = 6;  // reassinging not allowed
        // System.out.println(i+value);
    };
    
- Prior to Java 8, any variable that's used inside the anonymous class should be declared final.