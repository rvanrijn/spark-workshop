#spark-wordCount application

This Spark/Core application is the basic hello world spark application. These examples are copied from the spark-worshop at http://www.typesafe.com/activator/template/spark-workshop from Dean Wampler

#Input

The application runs on Spark and takes the King James Version of the Bible, then converts each line to lower case, creating an RDD.

#Output

The application writes the following files as output:

-WordCount2GroupBy
-WordCount2SortByCount
-WordCount2SortByWord

#Requirements 

Scala 2.10.5
SBT (Scala 2.10 compatible version)
Spark 1.4.0
