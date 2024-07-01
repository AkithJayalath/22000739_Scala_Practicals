error id: file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical3/src/main/scala/q3.scala:[8..11) in Input.VirtualFile("file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical3/src/main/scala/q3.scala", "object
def arithmeticMean(num1: Int, num2: Int): Double = {
  val mean = (num1 + num2) / 2.0
  BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}

// Test the function
val num1 = 5
val num2 = 9
val mean = arithmeticMean(num1, num2)
println(s"The arithmetic mean of $num1 and $num2 is $mean") // Output: The arithmetic mean of 5 and 9 is 7.00
")
file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical3/src/main/scala/q3.scala
file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical3/src/main/scala/q3.scala:2: error: expected identifier; obtained def
def arithmeticMean(num1: Int, num2: Int): Double = {
^
#### Short summary: 

expected identifier; obtained def