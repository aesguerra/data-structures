package org.minyodev

import org.apache.spark.annotation.Experimental

/**
  * Created by aesguerra on 6/7/17.
  *
  * If r > l
     *1. Find the middle point to divide the array into two halves:
             *middle m = (l+r)/2
     *2. Call mergeSort for first half:
             *Call mergeSort(arr, l, m)
     *3. Call mergeSort for second half:
             *Call mergeSort(arr, m+1, r)
     *4. Merge the two halves sorted in step 2 and 3:
             *Call merge(arr, l, m, r)
  */
@Experimental
object MergeSort {

  def divideList(arr: Array[Int], l: Int, r: Int): Unit = {
    if(l < r) {
      val m = l + (r - l) / 2
      divideList(arr, l, m)
      divideList(arr, m + 1, r)

      merge(arr, l, m, r)
    }
  }

  def merge(arr: Array[Int], l: Int, m: Int, r: Int): Unit = {
    // Find sizes of two subarrays to be merged
    val t1 = m - l + 1
    val t2 = r - m

    val tList = new Array(t1)
    val t2List = new Array(t2)

    (0 until t1)
  }

  def main(args: Array[String]): Unit = {

    val given = Array(2, 10, 6, 7, 8, 3, 9, 4)
    divideList(given, 0, given.length - 1)
  }
}
