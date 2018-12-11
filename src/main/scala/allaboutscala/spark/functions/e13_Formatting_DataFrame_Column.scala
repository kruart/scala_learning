package allaboutscala.spark.functions

import allaboutscala.spark.utils.Context

// http://allaboutscala.com/big-data/spark/#create-dataframe-from-tuples
object e13_Formatting_DataFrame_Column extends App with Context {
  val donuts = Seq(("plain donut", 1.50, "2018-04-17"), ("vanilla donut", 2.0, "2018-04-01"), ("glazed donut", 2.50, "2018-04-02"))
  val df = sparkSession
    .createDataFrame(donuts)
    .toDF("Donut Name", "Price", "Purchase Date")


  import org.apache.spark.sql.functions._
  import sparkSession.sqlContext.implicits._

  df
    .withColumn("Price Formatted", format_number($"Price", 2))  // to format price values by 2 decimal places
    .withColumn("Name Formatted", format_string("awesome %s", $"Donut Name")) // to prepend the text "awesome" to donut names
    .withColumn("Name Uppercase", upper($"Donut Name"))  // to convert the Donut Name values into uppercase
    .withColumn("Name Lowercase", lower($"Donut Name"))  // to convert the Donut Name value into lowercase
    .withColumn("Date Formatted", date_format($"Purchase Date", "yyyyMMdd"))  // to format the Purchase Date column using the format yyyyMMdd
    .withColumn("Day", dayofmonth($"Purchase Date"))  // to extract the day of the month from the Purchase Date
    .withColumn("Month", month($"Purchase Date"))     // to extract the month from the Purchase Date
    .withColumn("Year", year($"Purchase Date"))       // to extract the year from the Purchase Date
    .show()
}
