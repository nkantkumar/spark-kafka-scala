name := "spark-streaming-with-kafka"

version := "1.0"

scalaVersion := "2.11.8"

fork := true

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.2.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.2.0"
libraryDependencies += ("com.datastax.spark" %% "spark-cassandra-connector" % "2.0.2").exclude("io.netty", "netty-handler")

libraryDependencies += ("com.datastax.cassandra" % "cassandra-driver-core" % "3.0.0").exclude("io.netty", "netty-handler")

// Needed for structured streams
libraryDependencies += "org.apache.spark" %% "spark-sql-kafka-0-10" % "2.2.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"

libraryDependencies += "info.batey.kafka" % "kafka-unit" % "0.6"

libraryDependencies += "net.sf.jopt-simple" % "jopt-simple" % "5.0.2"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"

scalacOptions += "-target:jvm-1.8"


