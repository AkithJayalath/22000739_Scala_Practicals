object q3 extends App{
    def filterPrime(numbers: List[Int]): List[Int] = {
         def isPrime(n: Int): Boolean = {
            if (n <= 1) false
            else if (n == 2) true
            else !(2 until n).exists(i => n % i == 0)
    }

            numbers.filter(num => isPrime(num))
    }

    val input=List(1,2,3,4,5,6,7,8,9,10)
    val output=filterPrime(input)
    println(output)
    }