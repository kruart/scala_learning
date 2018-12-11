package allaboutscala.spark.functions

import allaboutscala.spark.utils.Context

// http://allaboutscala.com/big-data/spark/#create-dataframe-from-tuples
object e08_SplitArrayColumn extends App with Context {
  import sparkSession.sqlContext.implicits._

  val targets = Seq(("Plain Donut", Array(1.50, 2.0)), ("Vanilla Donut", Array(2.0, 2.50)), ("Strawberry Donut", Array(2.50, 3.50)))
  val df = sparkSession
    .createDataFrame(targets)
    .toDF("Name", "Prices")

  df.show()

  df.printSchema()

  // To split the Prices column (which is an Array of type double), we can reference the Prices column by the element index as shown below
  val df2 = df
    .select(
      $"Name",
      $"Prices"(0).as("Low Price"),
      $"Prices"(1).as("High Price")
    )

  df2.show()
}
