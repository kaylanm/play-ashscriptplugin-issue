name := """test-play"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala, DockerPlugin, AshScriptPlugin)
//  .settings(Seq(
//    bashScriptExtraDefines :=
//      """|is_cygwin() {
//         |  return 1
//         |}""".stripMargin +: bashScriptExtraDefines.value
//  ))

scalaVersion := "2.12.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test


// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
