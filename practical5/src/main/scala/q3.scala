object q3 {
    def fibonacci(n:Int):Int={
        if(n<=0) 0
        else if(n==1) 1
        else fibonacci(n-1) + fibonacci(n-2)
    }

    def printFib(n:Int):Unit={
        var i = 0
        while(i<n){
           println(fibonacci(i))
            i+=1
        }
    }

    def main(args: Array[String]):Unit={
        println("Enter no: ")
        val n = scala.io.StdIn.readInt()
        println(s"First $n Fibonacci numbers:")
        printFib(n)
    }

}