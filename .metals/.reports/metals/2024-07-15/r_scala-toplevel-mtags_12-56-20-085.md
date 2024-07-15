error id: file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical5/src/main/scala/q1.scala:[648..649) in Input.VirtualFile("file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical5/src/main/scala/q1.scala", "import scala.io.StdIn.readLine

object q1{
    def getProductList(): List[String] ={
        var products = List[String]()
        var input = ""

        while(input.toLowerCase !="done"){
            input = readLine("Enter product name(type 'done' to finish): ")
            if(input.toLowerCase != "done"){
                products = products :+input
            }
        }
        products
    }

    def printProductList(products:List[String]):Unit={
        var index=0
        while(index < products.length){
            println(s"${index +1}.${products(index)}")
            index +=1
        }
    }

    def 

}")
file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical5/src/main/scala/q1.scala
file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical5/src/main/scala/q1.scala:27: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace