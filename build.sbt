name := "scala_learning"
version := "0.1"
scalaVersion := "2.12.7"
triggeredMessage in ThisBuild := Watched.clearWhenTriggered

reColors := Revolver.noColors

//scalacOptions += "-deprecation"
scalacOptions ++= Seq("-deprecation")

libraryDependencies ++= Seq(
  "org.apache.spark"  %%  "spark-core"    % "2.4.0"   % "provided",
  "org.apache.spark"  %%  "spark-sql"     % "2.4.0",
  "org.apache.spark"  %%  "spark-mllib"   % "2.4.0"
)