pluginManagement {
  includeBuild("build-src")
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }
}
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
  }
}
rootProject.name = "android-app-starter"
include(":app")
include(":core:common")
include(":core:data")
include(":core:database")
include(":core:model")
include(":core:network")
include(":core:domain")
include(":feature:notes-favorite")
include(":feature:notes-crud")

