object q3 extends App{
    
def arithmeticMean(num1: Int, num2: Int): Double = {
  val mean = (num1 + num2) / 2.0
  BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}

val num1 = 6
val num2 = 3
val mean = arithmeticMean(num1, num2)
println(s"The arithmetic mean of $num1 and $num2 is $mean") 
}