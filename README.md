# Design Pattern
1. Creational Design pattern

      Factory Design Pattern :
      
      a)Factory design pattern is used when we have a super class with multiple sub-classes and based on input, 
        we need to return one of the sub-class.
      
      b)Super class in factory design pattern can be an interface, abstract class or a normal java class.
      
      The idea here is separation of concerns: If the code that uses the object also has enough information to instantiate it,       you don't need a factory. However, if there is some logic or configuration involved that you don't want to have the API         user to think about (or mess with), you can hide all that (and encapsulate it for reuse) in a factory.
      
      Important:
      
      We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
      
      Notice that based on the input parameter, different subclass is created and returned. getComputer is the factory method
      
      
