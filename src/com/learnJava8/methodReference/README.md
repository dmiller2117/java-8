# Method Reference

- Introduced as part of Java 8 and its purpose is to simplify the implementation of Functional Interfaces
- Shortcut for writing **Lambda Expressions.**
- Refer to a method in a class

## Syntax of Method reference:

    ClassName::instance-methodName
    ClassName::static-methodName
    Instance::methodName

## Where to use Method reference?

- Lambda expressions referring to a method directly.

### Using Lambda:

    Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();

### Using Method Reference:

    Function<String, String> toUpperCaseMethodReference = String::toUpperCase;

## Where Method Reference is not applicable?

**In defined logic:**

    Predicate<Student> predicateUsingLambda = (s) -> s.getGradeLevel() >= 3;
    

# Constructor Reference: