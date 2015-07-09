name := "spark-word-count"

version := "1.0"

scalaVersion := "2.10.5"

val sparkCore = "org.apache.spark" % "spark-core_2.10" % "1.4.0" % "provided"

val sparkSql = "org.apache.spark" % "spark-sql_2.10" % "1.4.0"

val scalaTest =  "org.scalatest" % "scalatest_2.10" % "2.2.5"

libraryDependencies ++= Seq(
  sparkCore,
  sparkSql,
  scalaTest
)
