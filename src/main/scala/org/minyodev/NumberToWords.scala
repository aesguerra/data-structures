package org.minyodev

import org.apache.spark.annotation.Experimental

import scala.collection.mutable

/**
  * Created by aesguerra on 7/27/17.
  */
@Experimental
object NumberToWords extends App {

  val i = 12345

  //println(convertNumberToWords(i))

  def singleDigitToNumber(i: Int): String = {
    i match {
      case 0 => "zero"
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case 6 => "six"
      case 7 => "seven"
      case 8 => "eight"
      case 9 => "nine"
      case 10 => "ten"
      case 11 => "eleven"
      case 12 => "twelve"
      case 13 => "thirteen"
      case 14 => "fourteen"
      case 15 => "fifteen"
      case 16 => "sixteen"
      case 17 => "seventeen"
      case 18 => "eighteen"
      case 19 => "nineteen"
    }
  }

  def firstPlace(i: Int): String = {
    i match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case 6 => "six"
      case 7 => "seven"
      case 8 => "eight"
      case 9 => "nine"
    }
  }

  def secondPlace(i: Int): String = {
    i match {
      case 1 => ""
      case 2 => "twenty"
      case 3 => "thirty"
      case 4 => "forty"
      case 5 => "fifty"
      case 6 => "sixty"
      case 7 => "seventy"
      case 8 => "eighty"
      case 9 => "ninety"
    }
  }

  def getPlace(place: Int, n: Int): String = {
    place match {
      case 1 => ""
      case 2 => ""
      case 3 => "hundred" // X00
      case 4 => "thousand" // X,000
      case 5 => secondPlace(n) + " thousand" // X0,000
      case 6 => "hundred thousand" // X0,000
      case 7 => "million" // X,000,000
      case 8 => "billion"
    }
  }


  val l = mutable.ListBuffer[Int]()

  // 231
  // 231 / 1
  // 231 / 10
  // 231 / 100

  def getDivisibility(i: Int, t: Int = 1, place: Int = 1): Int = {
    val d = i / t

    if(d < 10) {
      println("Place: " + place)
      println(getPlace(place, d))
      d
    }

      // 2nd digit pla
    else {
      //println(">> " + (z * 10))
      getDivisibility(i, t * 10, place + 1)
    }

  }

  println(getDivisibility(231))

  def convertNumberToWords(i: Int): String = {
    null
  }

//  println(a(1237))

//  def a(i: Int): Int = {
//    if(i)
//  }
}