package Tutorial07

object demo extends App{
   var c = Point(1,2)
   var d = Point(3,2)
   var g = c.dist(d)
   println(c)
   c.move(2,5)
   println(c)
   println(c+d)
   println(g)
   d.invert()
   println(d)
}