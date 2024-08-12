package creational_patterns.FactoryMethod;
/*
Factory Definition:
    - a creational pattern that creates objects, but allows the return type of the object
      to alter in subclasses
    - also allows business logic to be implemented in the factory class

Why a factory?
    - Factory methods can be used if you don't know the specific type of a generic interface beforehand
    - Reduces code that is similar but slightly different

How to implement a factory:
    - Need an interface of Products which will be the return type of the factory
    - Factory should be an abstract class with business logic implemented, but constructor (factory) method abstract
    - Subclasses of the factory should specify which Product subclass object to return.

 */
public class Factory {
}
