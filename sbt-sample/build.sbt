name := "scala-sbt-cross-compile"

organization := "sample"

version := "1.0"

crossScalaVersions := Seq("2.13.3", "2.12.11")

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % "1.3.0",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
  "org.scala-lang.modules" %% "scala-swing" % "2.1.1"
)

scalacOptions += "-deprecation"
