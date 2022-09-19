package Tutorial07
case class Point(var a:Int, var b:Int){
  def +(r:Point) = new Point(this.a + r.a, this.b + r.b)
  def move(a:Int, b:Int):Unit={
      this.a = this.a + a
      this.b = this.b + b
  }

  def dist(r:Point):Double = {
    var x:Int = this.a-r.a
    var y:Int = this.b-r.b
    var z : Int = x*x - y*y

    return scala.math.sqrt(z)
  }

  def invert():Unit = {
    var tmp = this.a
    this.a = this.b
    this.b = tmp
  }