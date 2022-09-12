object Q1 extends App {
    //driver codes
  val num1 = new Rational(1, 2)
  val num2 = new Rational(4, 5)
  //val num3 = new Rational(5,0);
  println(num1.neg)
  val q = num1.add(num2)
  println(q)
}
//rational class
class Rational(n: Int, d: Int) {
  require(denom > 0, "Denominator must be greater than 0") 
  def numer = n
  def denom = d

  //adding two rational numbers
  def add(r: Rational) = new Rational(
    this.numer * r.denom + this.denom * r.numer,
    this.denom * r.denom
  )
  def neg = new Rational(-this.numer, this.denom)
  override def toString(): String = numer + "/" + denom
}
