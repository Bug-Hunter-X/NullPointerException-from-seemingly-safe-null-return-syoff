```groovy
def myMethod(arg) {
  if (arg == null) {
    return null // This might seem correct but causes problems later
  }
  // ... rest of the method
}

println myMethod(null) // Prints null
println myMethod(myMethod(null)) // Throws NullPointerException
```