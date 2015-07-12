name := "spark-workshop"

version := "1.0"

scalaVersion := "2.10.5"

val sparkCore = "org.apache.spark" % "spark-core_2.10" % "1.4.0" % "provided"

val sparkSql = "org.apache.spark" % "spark-sql_2.10" % "1.4.0"

val sparkStreaming = "org.apache.spark" % "spark-streaming_2.10" % "1.4.0"

val sparkMllib = "org.apache.spark" % "spark-mllib_2.10" % "1.4.0"

val jacksonDatabind = "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4"

val googleGson = "com.google.code.gson" % "gson" % "2.3.1"

val sparkStreamingTwitter = "org.apache.spark" % "spark-streaming-twitter_2.10" % "1.4.0"

val twitter4j = "org.twitter4j" % "twitter4j-core" % "3.0.3"

val scalaTest =  "org.scalatest" % "scalatest_2.10" % "2.2.5"

libraryDependencies ++= Seq(
  sparkCore,
  sparkSql,
  sparkStreaming,
  sparkMllib,
  jacksonDatabind,
  googleGson,
  sparkStreamingTwitter,
  twitter4j,
  scalaTest
)