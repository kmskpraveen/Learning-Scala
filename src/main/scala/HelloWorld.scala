/*
 * This file created for Object-Orientation, Abstraction,
 * and Data Structures using Scala
 */

/**
  * This is the main object for our application
  */
object HelloWorld {

  val name = "Pat Cook" // val name:String = "Pat Cook"
  val value = 42
  var age = 22
  age += 1 // when you make a val and points to an object, ..
  // .. it always points to the same object and not able to reassign
  // .. but with the help of var we can reassign

  // Some types: String, Int, Double, Char, Boolean, Unit
  val t = (1,2.7,"hi there") // like Tuple
  val (a,b,c) = t
  println(t._1)

  val message = name + " is " + age + " years old." // string concatenation
  val message2 = s"$name is ${age+1} years old." // string interpolation
  val message3 = s"The second element of t is ${t._2}."
  println(message)
  println(message2)
  println(message3)

  /**
    * This is the main method for the application.
    * @param args the arguments to the application.
    */
  def main(args: Array[String]): Unit = {
    println("Hello World!") // This prints something
  }
}