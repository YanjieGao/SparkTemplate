import sbt._
import Keys._
import sbtassembly.Plugin._
import AssemblyKeys._
name := "SparkTemplate"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.2.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.2.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "1.2.0"

libraryDependencies += "org.apache.kafka" %% "kafka" % "0.8.1.1"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

resolvers += "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"
