package allaboutscala.spark.functions

import allaboutscala.spark.utils.Context
import org.apache.spark.sql.functions.explode

// http://allaboutscala.com/big-data/spark/#create-dataframe-from-tuples
object e04_ExplodeJson extends App with Context {
  // Json into DataFrame using explode()
  import sparkSession.sqlContext.implicits._
  val tagsDF = sparkSession
    .read
    .option("multiLine", true)
    .option("inferSchema", true)
    .json("src/main/resources/tags_sample.json")

  val df = tagsDF.select(explode($"stackoverflow") as "stackoverflow_tags")

  df.printSchema()

  df.select(
    $"stackoverflow_tags.tag.id" as "id",
    $"stackoverflow_tags.tag.author" as "author",
    $"stackoverflow_tags.tag.name" as "tag_name",
    $"stackoverflow_tags.tag.frameworks.id" as "frameworks_id",
    $"stackoverflow_tags.tag.frameworks.name" as "frameworks_name"
  ).show()
}
