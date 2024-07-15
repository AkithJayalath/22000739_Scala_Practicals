import scala.io.StdIn.readLine

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

    def  getTotalProducts(products:List[String]):Unit={
        println(s"Total no of products : ${products.length}")
    }


    def main(args: Array[String]):Unit={
        val products= getProductList()
        println("Product List: ")
        printProductList(products)
        getTotalProducts(products)
    }

}