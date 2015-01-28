import de.johoop.findbugs4sbt.FindBugs._

name := "squbs-pattern"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "com.typesafe.akka" %% "akka-actor" % "2.3.6" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.6" % "test",
  "com.typesafe.akka" %% "akka-contrib" % "2.3.6" % "test" intransitive(),
  "org.squbs.testkit" %% "squbs-testkit" % version.value % "test",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test->*"
)

findbugsSettings

// findbugsExcludeFilters := Some(scala.xml.XML.loadFile (baseDirectory.value / "findbugsExclude.xml"))

org.scalastyle.sbt.ScalastylePlugin.Settings

// (testOptions in Test) += Tests.Argument(TestFrameworks.ScalaTest, "-h", "report/squbs-pattern")

instrumentSettings