val words = Array("Mary", "Had", "a", "little", "lamb", "its", "fleece", "was", "white", "as", "snow", "and", "everywhere")

words.groupBy(_.substring(0,1))

words.groupBy(_.length)

// Partition functions

"New York".partition(_.isUpper)

import scala.collection.mutable.ArrayBuffer

val buf = ArrayBuffer(1, 2, -3, 4, -5, 6, -7, 8)

val (neg, pos) = buf.partition(_ < 0)

val result = pos
result += neg(0)

result

val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)

val pairs = symbols.zip(counts)


for((s, n) <- pairs) print(s * n)