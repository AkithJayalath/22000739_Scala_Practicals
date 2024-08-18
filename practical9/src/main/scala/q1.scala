object q1 extends App{
    println("Please enter deposite amount: ")
    val depositAmount = scala.io.StdIn.readLine().toDouble

    def calculateInterest : Double => Double =(depositeAmount : Double) => {
        depositAmount match {
            case amount if amount <= 20000 => amount * 0.02
            case amount if amount <= 200000 => amount * 0.04
            case amount if amount <= 2000000 => amount * 0.035
            case amount if amount > 2000000 => amount * 0.065
        }
    }

     val interest = calculateInterest(depositAmount)
     println(s"Interest for Rs. $depositAmount: Rs. $interest")
}