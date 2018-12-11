package allaboutscala.spark.functions

import allaboutscala.spark.utils.Context

// http://allaboutscala.com/big-data/spark/#create-dataframe-from-tuples
object e16_DataFrameDropNull extends App with Context {
  val donuts = Seq(("plain donut", 1.50), (null.asInstanceOf[String], 2.0), ("glazed donut", 2.50))
  val dfWithNull = sparkSession
    .createDataFrame(donuts)
    .toDF("Donut Name", "Price")

  dfWithNull.show()

  val dfWithoutNull = dfWithNull.na.drop()
  dfWithoutNull.show()
}
