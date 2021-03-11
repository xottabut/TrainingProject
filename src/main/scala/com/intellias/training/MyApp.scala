package com.intellias.training

import scala.collection.JavaConverters._
object MyApp {

  def main(args: Array[String]): Unit = {

    for {i <- 1 to 10} {
      println(s"I'm ${i -> i * i}")
    }

    val nums = Seq(1, 5, 6, 89)


    val res = nums
      .map(_ to 10)
      .filter(_.size < 100)
      .flatten
      .map(_.toString)
      .splitAt(4)

    println(res)

  }

}
