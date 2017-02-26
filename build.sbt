name := "untitled"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies += "org.scalameta" %% "scalameta" % "1.4.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")
