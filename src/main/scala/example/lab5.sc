import java.awt.Rectangle
val rectangle = new Rectangle(10,20, 30, 50)

rectangle.translate(20, 10)
rectangle

import java.awt.geom.Ellipse2D



//egg.translate

trait ellipselike {
  def setFrame(x: Double, y: Double, w: Double, h: Double): Unit
  def getX: Double
  def getY: Double
  def getWidth: Double
  def getHeight: Double
  def translate(dx: Double, dy: Double) { setFrame(getX + dx, getY + dy, getWidth, getHeight) }

  override def toString: String = f"${getX}, ${getY}"
}

val egg = new Ellipse2D.Double(5,10,20,30) with ellipselike

egg.translate(10, 20)
egg


// Reversing the mixin order

