package org.mycaule

import scala.util.Random
import Math.pow
import scala.math.BigDecimal

object PiDigits {
  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println(f"Elapsed time: ${(t1 - t0)/1.0e9}%.2f s")
    result
  }

  def bbp(k: Int) = 1.0/pow(16,k) * (4.0/(8*k+1) - 2.0/(8*k+4) - 1.0/(8*k+5) - 1.0/(8*k+6))

  def bbpSeries: Stream[BigDecimal] = {
    bbp(0) #:: Stream.from(1).map(k => bbp(k) + bbpSeries(k-1))
  }

  def main(args: Array[String]): Unit = {
    val i = args(0).toInt

    time {
      println(s"term: $i")
      println(f"value: ${bbpSeries(i)}%.20f...")
      println(f"digit: TODO...")
      println(f"error: ${bbp(i+1)}%.2e")
    }
  }
}
