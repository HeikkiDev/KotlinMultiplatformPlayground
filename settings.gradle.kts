pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KotlinMultiplatformPlayground"
include(":androidApp")
include(":shared")