

case class point(var x:Int,var y:Int){
    def add(r:point)=new point(this.x+r.x,this.y+r.y)
    def move(x:Int,y:Int):Unit={
        this.x=this.x+x
        this.y=this.y+y
    }
    def distance(a:point):Double={
        var XDlist=this.x-a.x
        var YDlist=this.y-a.y
        var distance_1=(XDlist*XDlist)+(YDlist*YDlist)
        return scala.math.sqrt(distance_1)
    }
    def invert():Unit={
        var temp=this.x
        this.x = this.y
        this.y = temp
    }

}
object q1 extends App{
    var p1=point(1,2)
    var p2=point(2,4)
    var p3=p1.add(p2)
    println(p3)
    p1.move(x=3,y=5)
    println(p1)
    var p5=p1.distance(p2)
    println(p5)
    p2.invert()
    println(p2)

}