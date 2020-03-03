// functional programming

// functions as values

import scala.math._
val num = 3.14

val fun = ceil _

// calling a function
fun(num)

Array(3.14, 1.42, 2.0).map(fun)

// anonymous function in Scala

Array(3.14, 1.42, 2.0).map((x: Double ) => 3 * x)


// higher order function
// function consuming another an function or produces another function

def valueAtOneQuarter(f: (Double) => Double)  = f(0.25)

valueAtOneQuarter(ceil _)

valueAtOneQuarter(sqrt _)

def mulBy(factor: Double)= (x: Double) => factor *  x