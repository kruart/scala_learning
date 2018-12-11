package allaboutscala.spark.functions

import allaboutscala.spark.utils.Context

// http://allaboutscala.com/big-data/spark/#create-dataframe-from-tuples
object e10_DataFrameConstantColumn extends App with Context {
  val donuts = Seq(("plain donut", 1.50), ("vanilla donut", 2.0), ("glazed donut", 2.50))
  val df = sparkSession.createDataFrame(donuts).toDF("Donut Name", "Price")

  import org.apache.spark.sql.functions._
  val df2 = df
    .withColumn("Tasty", lit(true))
    .withColumn("Correlation", lit(1))
    .withColumn("Stock Min Max", typedLit(Seq(100, 500)))

  df2.show()
}
