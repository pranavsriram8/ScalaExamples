val a = new Array[Int](10)

for(i <- 0 until a.length) a(i) = i * i


for(ele <- a) println(ele)

import scala.collection.mutable.ArrayBuffer

val b = ArrayBuffer("Mary", "Had", "a", "little", "lamb")

b += "star"
//b += ("twinkle", "twinkle", "little", "star")

b ++= Array("How", "I", "wonder")

b.remove(3)

b.insert(3, "medium-sized")

b.trimEnd(3)