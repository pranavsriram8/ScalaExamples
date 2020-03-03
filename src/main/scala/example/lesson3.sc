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
//b

b.trimEnd(3)
//b


val array1 = Array(2, 3, 5, 11)

val result = for( ele <- array1 if ele % 2 != 0 ) yield 2 * ele

//using common array algorithms

val sort = ArrayBuffer(1, 7, 2, 9)
sort.sorted
// notice that the array is not mutated
sort

sort.reverse
sort
sort.toString()
sort.mkString("|")

// maps and tuples in scala
// most important data structure map

// by



