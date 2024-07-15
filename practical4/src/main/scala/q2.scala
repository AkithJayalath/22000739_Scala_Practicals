object q2 {
  def main(args: Array[String]): Unit = {
    
    println("Please enter an integer:")
    
   
    val input = scala.io.StdIn.readInt()
    
    
    input match {
      case x if x <= 0 => println("Negative/Zero")
      case x if x % 2 == 0 => println("Even number ")
      case x if x % 2 != 0 => println("Odd number ")
    }
  }
}
