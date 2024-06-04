name := "dfdl-gps-sps"

organization := "com.owlcyberdefense.gpssps"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.19"

libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.1.0" % "test",
  "com.github.sbt" % "junit-interface" % "0.13.3" % "test",
  "junit" % "junit" % "4.13.2" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false
