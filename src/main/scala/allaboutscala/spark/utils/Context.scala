package allaboutscala.spark.utils

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

trait Context {
  lazy val sparkConf = new SparkConf()
    .setAppName("Learn Spark")
    .setMaster("local[*]")  // Run Spark locally with as many worker threads as logical cores on your machine
    .set("spark.cores.max", "2")  // the maximum amount of CPU cores

  lazy val sparkSession = SparkSession
    .builder()
    .config(sparkConf)
    .getOrCreate()
}
