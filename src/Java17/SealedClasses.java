package Java17;

//Restrict which classes can extend a class or implement an interface.
public sealed class SealedClasses permits Car, Truck {}

final class Car extends SealedClasses {}
final class Truck extends SealedClasses {}

//✅ Benefits:
//Controlled class hierarchies

//Enhances maintainability and security

//Works well with pattern matching and exhaustive switch

