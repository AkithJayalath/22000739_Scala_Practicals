object q2 extends App{

    println("Please enter an integer:")
    val input = scala.io.StdIn.readInt()

    val printNegativeZero = () => println("Negative or zero")
    val printEven = () => println ("Even Number")
    val printOdd = () => println("Odd Number")
    
    input match {
        case x if x <= 0 =>printNegativeZero()
        case x if x%2 == 0 => printEven()
        case _=>printOdd()
    }
    
}