pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")  // ✅ Ganti ini
        }
    }
}



rootProject.name = "LirikLagu"
include(":app")
