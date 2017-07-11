# Popular algorithms for computing π

### Bailey - Borwein - Plouffe formula

```
π = sum (k=0..oo) 1/16^k [ 4/(8k+1) - 2/(8k+4) - 1/(8k+5) - 1/(8k+6) ]
```

```bash
# Compilation
$ scalac PiDigits.scala

# Computing 20th term of the series
$ scala org.mycaule.PiDigits 20
term: 20
value: 3.14159265358979320597...
digit: TODO...
error: 2.65e-29
Elapsed time: 1.77 s
```

Benchmarks

| k  | error    | time   |
|----|----------|--------|
| 20 | 2.65e-29 |  1.81s |
| 21 | 1.51e-30 |  3.23s |
| 22 | 8.67e-32 |  5.95s |
| 23 | 4.98e-33 | 11.60s |
| 24 | 2.87e-34 | 22.32s |
| 25 | 1.66e-35 | 50.05s |

### TODO

* How to extract the desired digit in BBP formula?
* Write comments explaining algorithm.

### References

#### Maths
* [Wikipedia - Approximations of π](https://en.wikipedia.org/wiki/Approximations_of_π)
* [Jean-Paul Delahaye - Le fascinant nombre Pi](http://amzn.eu/doD4OlV)

#### Scala
* [How to use the Scala Stream class, a lazy version of List](http://alvinalexander.com/scala/how-to-use-stream-class-lazy-list-scala-cookbook)
* [Easily measuring code execution time in Scala](http://biercoff.com/easily-measuring-code-execution-time-in-scala/)
* [scala.math.BigDecimal](http://www.scala-lang.org/api/2.12.x/scala/math/BigDecimal.html)
