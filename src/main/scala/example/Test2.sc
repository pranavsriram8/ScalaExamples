// conditional expressions

/*val x = 4

if(x > 0) 1 else -1 // => has a value ==> therefore it has a type

val result = ()

// block expressions

// scala does not have  traditional for loops
// it has for each

for(i <- 1 to 10) println(i)

//for { i <- 1 to 3
//      j <- 1 to 3 } print((10 * i + j) +  " ")

val result = for(i <- 1 to 10) yield i % 3

def abs(x: Double) = if (x >= 0) x else -x

def factorial(n: Int): Int = if (n <= 0) 1 else n * factorial(n - 1)

// procedures vs function vs void(unit) functions

def fact(m: Int) :Int =   {
  var r = 1
  for (i <- 1 to m) r = r * i
  r
}

fact(10)
*/
  def isVowel(c: Char) = "aeiou".contains(c)

  def vowels(s: String) =
    for (ch <- s if isVowel(ch)) yield ch


  vowels("Pranav Sriram")


//  def vowelsWhile(s: String): String = {
//    var i = 0
//    var ans = ""
//    while (i < s.length) {
//      if (isVowel(s(i))) {
//        ans = ans + s(i)
//      }
//    }
//    ans
//  }

  //vowelsWhile("Oranav Sriram")

  def vowelsRecursive(s: String): String = {
    // base case
    if (s.length == 0) ""
    else {
      val ch = s(0)
      val rest = vowelsRecursive(s.substring(1))
      if (isVowel(ch)) ch + rest else rest
    }
  }

  vowelsRecursive("Chinmay is here")

  def vowelsWhile(s: String): String = {
    var i = 0
    var ans = ""
    while (i < s.length) {
      if (isVowel(s(i))) {
        ans = ans + s(i)
      }
      i += 1
    }
    ans
  }

vowelsWhile("oranav Sriram")

def favVowels(s: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true): String = {
  for (ch <- (if (ignoreCase) s.toLowerCase else s) if vowelChars.contains(ch)) yield ch
}

favVowels(" pranavsriram")

def faVowels(s: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true): String = {
  if(ignoreCase) faVowels(s.toLowerCase, vowelChars, false)
  for (ch <- s if vowelChars.contains(ch)) yield ch
}


faVowels("pranavsriramo")