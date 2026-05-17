package java15;

//Helps with better modeling of class hierarchies and exhaustive checks in switch expressions.

public abstract sealed class SealedClasses permits Circle, Rectangle {}

final class Circle extends SealedClasses {}
final class Rectangle extends SealedClasses {}

//✅ Benefits:
//Control over class extension

//Better code safety

//Works well with pattern matching

