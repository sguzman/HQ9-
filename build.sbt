/** Name of project */
name := "ScHQ9+"

/** Project Version */
version := "1.0"

/** Scala version */
scalaVersion := "2.11.8"

/** Scalac parameters */
scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

/** Javac parameters */
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

/** Resolver */
resolvers ++= Seq(
  "Search Maven" at "https://repo1.maven.org/maven2/"
)

/** Source Dependencies */
libraryDependencies ++= Seq(
  /** Compile dependencies */
  "org.apache.commons" % "commons-lang3" % "3.4",
  /** Test dependencies */
  "org.scalatest" % "scalatest_2.11" % "2.2.6"
)

/** Make sure to fork on run */
fork in run := true

/** Make sure to fork on test */
fork in test := true