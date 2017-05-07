name := "mockito-bug"
version := "1.0.0-SNAPSHOT"
organization := "eu.sipria.scala"

scalaVersion := "2.11.11"

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:reflectiveCalls",
  "-feature",
  "-Xfatal-warnings"
)

libraryDependencies ++= Seq(
  "com.jcraft" % "jsch" % "0.1.54",

  "org.scalatest" %% "scalatest" % "2.2.6" % Test,
  "org.mockito" % "mockito-core" % "1.10.19" % Test
)
