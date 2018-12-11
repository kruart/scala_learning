package allaboutscala.spark.functions

import allaboutscala.spark.utils.Context

// http://allaboutscala.com/big-data/spark/#create-dataframe-from-tuples
object e07_CheckDataFrameColumnExist extends App with Context {
  val donuts = Seq(("plain donut", 1.50), ("vanilla donut", 2.0), ("glazed donut", 2.50))
  val df = sparkSession.createDataFrame(donuts).toDF("Donut Name", "Price")

  df.show()

  // Check DataFrame column exists
  val priceColumnExists = df.columns.contains("Price")
  println(s"Does price column exist = $priceColumnExists")
}
