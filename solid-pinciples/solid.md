# SOLID PRINCIPLES

---

S - Single responsibility principle:
* Bir classı dəyişmək üçün yanlız və yanlız bir səbəb olmalıdır
* This means that a class should have only one responsibility or job, and it should not be responsible for more than one aspect of the system's functionality. If a class has multiple responsibilities, it becomes more difficult to maintain and modify over time.
  * Can apply variables, methods, classes and microservices
  * [CleanCoder - SRP](https://blog.cleancoder.com/uncle-bob/2014/05/08/SingleReponsibilityPrinciple.html)


O - Open closed principle:
* Software entities should be open for extension but closed for modification.
*  This means that the behavior of a class or module should be easily extensible by adding new code, but without modifying the existing code. This allows for more flexibility and easier maintenance, as changes can be made without affecting the existing code.
  * Yenilik üçün yeni kod əlavə oluna bilər
  * Köhnə kod dəyişməməlidir
* Bu prinsipə aid olan design patternlər:
  * Adapter
  * Bridge
  * Facade
  * Flyweight 
  * Strategy

L - Liskov Substitution principle:
* Subclass objects can replace superclass objects

Interface Segregation Principle (ISP):
* A client should not be forced to depend on methods it does not use. 
* This means that interfaces should be segregated into smaller, more focused ones, so that clients only depend on the methods that they need. This reduces the complexity of the code and improves maintainability.

Dependency Inversion Principle (DIP): 
* High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions. 
* This means that the code should depend on abstractions rather than concrete implementations, so that changes in one component do not affect other components. This improves modularity and testability.

Together, these principles help to create more modular, flexible, and scalable software that can be easily maintained and updated over time.


[SOLID Design Principles](https://stackify.com/solid-design-principles/)