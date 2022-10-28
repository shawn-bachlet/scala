package com.rockthejvm

object Basics extends App {

  val meaningOfLife: Int = 43
  val aBoolean = false
  val anInterpolatedString = s"The meaning of life is $meaningOfLife" 
  val ifExpression = if (meaningOfLife > 43) 56 else 999
  val chainedExpression = 
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0
  val aCodeBlock = {
    val aLocalValue = 67
    aLocalValue + 3
  }

  def myFunction(x: Int, y:String): String = {
    y + " " + x
  }

  def factorial(n: Int): Int = 
    if (n <= 1) 1
    else n * factorial(n-1)

}
