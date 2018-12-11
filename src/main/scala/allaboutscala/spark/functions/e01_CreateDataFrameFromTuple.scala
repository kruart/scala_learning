package allaboutscala.spark.functions

import allaboutscala.spark.utils.Context

// http://allaboutscala.com/big-data/spark/#create-dataframe-from-tuples
object e01_CreateDataFrameFromTuple  extends App with Context {
  val donuts = Seq(("plain donut", 1.50), ("vanilla donut", 2.0), ("glazed donut", 2.50))

  // create Dataframe with two columns from Sequence of Tuples
  val df = sparkSession
    .createDataFrame(donuts)
    .toDF("Donut Name", "Price")

  df.show()
}
