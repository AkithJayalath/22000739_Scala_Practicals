class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator must be non-zero")

  val numerator: Int = n
  val denominator: Int = d

 
  def sub(that: Rational): Rational = {
    new Rational(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator
    )
  }

  override def toString: String = s"$numerator/$denominator"
}

object q2 extends App {
  val x = new Rational(5, 8)
  val y = new Rational(2, 7)

 
  val result = x.sub(y)

 
  println(s"x = $x")            
  println(s"y = $y")           
  println(s"x - y = $result")   
}
