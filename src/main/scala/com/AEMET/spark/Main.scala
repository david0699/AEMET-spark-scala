package com.AEMET.spark

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("AemetSpark")
      .getOrCreate()

    println("Spark job started.")

    spark.stop()
  }
}
