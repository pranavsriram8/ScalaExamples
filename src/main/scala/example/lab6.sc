val n = 10
var i = 1
var f = 1

def While(cond: () => Boolean, body: () => Unit): Unit = {
  if(cond()) {
    body()
    // while loop, instead of using loop we use recursion
    While(cond, body)
  }
}

While(() => i < n, () => { f *= i; i += 1})
f

