object q4 extends App{

def sumOfEvenNumbers(numbers: List[Int]): Int = {
  numbers.filter(_ % 2 == 0).sum
}


val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val sum = sumOfEvenNumbers(input)
println(s"The sum of even numbers in the list is $sum") 
}