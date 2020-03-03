
// Object oriented programming in Scala

class Point (val x: Double, val y: Double) {

  def move(dx: Double, dy: Double) = new Point(x + dx, y + dy)

  def distanceFromOrigin = math.sqrt (x * x + y * y)

  // All classes in scala extends java.lang so, toString needs to be overriden
  override def  toString = f"(${x}, ${y})"
  // f = is format in to String 

}

val p = new Point(3, 4)

p.move(10, 20)

p.distanceFromOrigin

p.toString

// make classes immutable
// sharing is safe
// important for concurrency


// access modifiers like private also there like in java
class Bank {
  private var bankBalance  = 0.0;
}

// construction and class parameters

class Point (val x: Double, val y: Double) {
  def this() { this(0,0) }
  def move(dx: Double, dy: Double) = new Point(x + dx, y + dy)

  def distanceFromOrigin = math.sqrt (x * x + y * y)

  // All classes in scala extends java.lang so, toString needs to be overriden
  override def  toString = f"(${x}, ${y})"
  // f = is format in to String

}


// class Point(val x: Double = 0, val y: Double = 0)





