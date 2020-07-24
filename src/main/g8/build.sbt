import Dependencies._

// give the user a nice default project!
ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "$scalaVersion$"
ThisBuild / version      := "$version$"

$if(useSbtUpdates.truthy)$
addCommandAlias("fullDependencyUpdates", ";dependencyUpdates; reload plugins; dependencyUpdates; reload return")
$endif$

inThisBuild(Seq(
  addCompilerPlugin(Plugin.`better-monadic-for`),
  addCompilerPlugin(Plugin.`kind-projector`)
))

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies ++= Seq(
      `cats-core`,
      `cats-effect`,
      `scala-test` % Test
    )
  )
