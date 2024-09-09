 class Rational(n: Int,d:Int){
    require(d!=0,"Denomenator must be non-zero")

    val numerator:Int =n
    val denominator:Int =d

    def neg:Rational = new Rational(-numerator,denominator)

    override def toString(): String = s"$numerator/$denominator"
}


object q1 extends App{

    val x =new Rational(3,4)
    println(s"x=$x")
    println(s"x.neg=${x.neg}")
}