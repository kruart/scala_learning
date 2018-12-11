package allaboutscala.spark.functions

import allaboutscala.spark.utils.Context

// http://allaboutscala.com/big-data/spark/#create-dataframe-from-tuples
object e03_DataFrameColumnNamesAndDataTypes extends App with Context {
  val donuts = Seq(("plain donut", 1.50), ("vanilla donut", 2.0), ("glazed donut", 2.50))
  val df = sparkSession
    .createDataFrame(donuts)
    .toDF("Donut Name", "Price")

  // column names and types
  val (columnNames, columnDataTypes) = df.dtypes.unzip
  println(s"DataFrame column names = ${columnNames.mkString(", ")}")
  println(s"DataFrame column data types = ${columnDataTypes.mkString(", ")}")
}
