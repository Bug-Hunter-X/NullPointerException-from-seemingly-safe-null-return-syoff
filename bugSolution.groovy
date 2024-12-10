```groovy
def myMethod(arg) {
  if (arg == null) {
    return null 
  }
  // ... rest of the method
}

def handleNull(result) {
  if (result == null) {
    return "Null value encountered"
  }
  return result
}

println handleNull(myMethod(null)) // Prints "Null value encountered"
println handleNull(myMethod(5)) // Prints 5

```