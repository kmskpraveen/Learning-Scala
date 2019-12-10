package basics

// Import statements are ways for you to be able to use shorter names..
// Note: imports can also be scoped (same way as Declarations)
import scala.io.StdIn._ // import everything instead of only readLine

object Libraries {
  def main(args: Array[String]): Unit = {
    println("What is your name?")
    // val name = scala.io.StdIn.readLine()
    // Instead of this you can use readLine as scala.io.StdIn._ is imported
    val name = readLine()
    // ???
    // The above line is a valid thing (it compiles but won't run) of type Nothing
    println("How old are you?")
    val age = readInt()

    // In scala terminal, you can build an array using Array(1,2,3,4) (here 1,2,3,4 are arguments)
    // We can also build list in the same way, List('a','e','i')
    // Both in Array, Lists we can access content from indexing
    // Array is mutable, but list is not mutable
    // Consider val arr = Array(1,2,3,4,5)
    // arr(2) = 99 is possible although arr is val
    // But arr = Array(4,6,7,8) is not possible..
    // arr always points to the initial Array as it is val
    // But the content of the arr can change as Array is mutable

    // We can easily add an element to the front of a List
    // res1 = List('a','e','i') (use scala terminal)
    // 'b' :: res1
    // results new List res11 (= List('b','a','e','i'))

    // It is advised that if you have a variable length go for List
    // if there is a fixed length and mutability, go for Array
    // We can covert List to Array using .toArray method
    // similarly we can convert Array to List using .toList method
  }
}
