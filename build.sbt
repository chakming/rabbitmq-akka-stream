name := """rabbitmq-akka-stream"""

version := "2.0"

organization := "io.scalac"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "snapshots"           at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"            at "http://oss.sonatype.org/content/repositories/releases",
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

//doesn't work with Activator
//EclipseKeys.withSource := true

libraryDependencies ++= {
  Seq(
    "com.typesafe.akka"          %%  "akka-actor"               % "2.4.2",
    "com.typesafe.akka"          %%  "akka-stream-experimental" % "2.0.3",
    "io.scalac"                  %%  "reactive-rabbit"          % "1.0.3",
    "com.typesafe.scala-logging" %%  "scala-logging-slf4j"      % "2.1.2",
    "ch.qos.logback"             %   "logback-core"             % "1.1.5",
    "ch.qos.logback"             %   "logback-classic"          % "1.1.5",
    "org.scalatest"              %%  "scalatest"                % "2.2.6" % "test"
  )
}

fork in run := true
