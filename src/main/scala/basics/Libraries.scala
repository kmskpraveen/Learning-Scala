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
  }
}
