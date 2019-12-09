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

  // Expressions have a value as outcome but statements don't
  // value + age is same as value.+(age)
  // value min age is same as value.min(age)
  // + has more precedence than min (char started)
  println(value min age + 5)
  // value == age is false
  println(name == "Pat Cook") // in scala true; in java false
  println(" Hi " * 5)
  // 4+5 = 9; 4+5.0 = 9.0; 9/5 = 1; 9%5 = 4; 9/5.0 = 1.8
  // true && true = true; !true = false

  // Lambda expressions or closures or function leterals
  // In python it is referred with keyword 'lambda'
  // In scala it has syntax => (pronounced as rocket)
  val square = (x:Double) => x*x
  // or val square: Double => Double = x => x*x
  println(square(14))
  // Note that def square(x:Double):Double = x*x
  // .. is a method
  val twice: Double => Double = _*2
  val lt: (Double, Double) => Boolean = _ < _
  println(twice(5))
  println(lt(5,9))
  // _ cannot be used in square as it uses x 2 times

  /**
    * This is the main method for the application.
    * @param args the arguments to the application.
    */
  def main(args: Array[String]): Unit = {
    println("Hello World!") // This prints something

    var i = 0
    while(i < 10) {
      println(i)
      i += 1 // i = i + 1
      // There are no prefix or postfix operators in scala (like i++ or so)
    }
    // While is like a statement
    i = 0
    do {
      println(i)
      i += 1
    } while(i < 10)

    // If is like an expression but can also use as statement
    if (age < 18) {
      println("No Entrance")
    } else {
      println("Come in")
    }
    val response = if (age < 18) {
      "No Entrance"
    } else {
      "Come in"
    }
    println(response)
    println(if (age < 18) "No Entrance" else "Come in")

    val a = if(true) "hi" else 5 // This is possible as a is any
    // .. but not preferred much

    // For is also used as statements and as expressions
    // Here in for (..) we are using generators
    for (i <- 0 to 10) { // you can also use until instead of to but 10 won't print
      println(i)
    }
    // We can also put conditionals in for (..)
    for (i <- 0 until 10; if i%3==0 || i%5==0) {
      println(i)
    }
    // we can also use multiple generators and have variables
    for (i <- 0 until 10; if i%3==0 || i%5==0; sqr = i*i; j <- 'a' to 'c') {
      println(i+" "+j)
    }
    // Alternate syntax for above one
    // .. use curly braces to get rid of semi-columns
    for {
      i <- 0 until 10
      if i % 3 == 0 || i % 5 == 0
      sqr = i * i
      j <- 'a' to 'c'
    } {
      println(i+" "+j)
    }
    // In order to use for as expression use 'yield'
    val stuff = for {
      i <- 0 until 10
      if i % 3 == 0 || i % 5 == 0
      sqr = i * i
      j <- 'a' to 'c'
    } yield {
      i -> j
    }
    println(stuff)

    // match expression
    // fizzbuzz example (traditional)
    val fizzbuzz = for(i <- 1 to 20) yield {
      if(i%3==0 && i%5==0) "fizzbuzz"
      else if(i%3==0) "fizz"
      else if(i%5==0) "buzz"
      else i.toString
    }
    println(fizzbuzz)

    // fizzbuzz example using match
    val fizzbuzz1 = for(i <- 1 to 20) yield {
      (i%3,i%5) match {
        case (0,0) if i<25=> "fizzbuzz"  // you can also add if statements
        case (0,_) => "fizz"
        case (_,0) => "buzz"
        case _ => i.toString
      }
    }
    println(fizzbuzz1)

  }
}