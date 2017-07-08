organization := "com.nrinaudo"
scalaVersion := "2.12.2"


enablePlugins(TutPlugin, SitePlugin, GhpagesPlugin)

git.remoteRepo := "git@github.com:nrinaudo/workshop-finch.git"

val tutDirName = settingKey[String]("tut output directory")
tutDirName := "./"

addMappingsToSiteDir(tut, tutDirName)

includeFilter in SitePlugin.autoImport.makeSite :=
    "*.yml" | "*.md" | "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.eot" | "*.svg" | "*.ttf" |
    "*.woff" | "*.woff2" | "*.otf"
