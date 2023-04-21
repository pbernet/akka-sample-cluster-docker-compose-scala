name := "akka-sample-cluster-docker-compose-scala"

/* scala versions and options */
scalaVersion := "2.13.10"

// These options will be used for *all* versions.
scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-encoding", "UTF-8",
  "-Xlint",
)

val akka = "2.6.20"

/* dependencies */
libraryDependencies ++= Seq (
  // -- Logging --
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  // -- Akka --
  "com.typesafe.akka" %% "akka-actor-typed"   % akka,
  "com.typesafe.akka" %% "akka-cluster-typed" % akka,
)

Docker / version := "latest"
Docker / dockerExposedPorts := Seq(1600)
dockerBaseImage := "adoptopenjdk/openjdk11"
enablePlugins(JavaAppPackaging)
