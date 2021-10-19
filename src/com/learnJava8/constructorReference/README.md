# Constructor Reference:

Introduced as part of Java 1.8

Syntax:

    Class::new
     
Example:

    Supplier<Student> studentSupplier = Student::new;
    
Invalid:

    Student student = Student::new; // compilation issue