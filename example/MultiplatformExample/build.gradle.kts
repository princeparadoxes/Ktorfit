buildscript {
    repositories {
        gradlePluginPortal()
        google()
      //  mavenLocal()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21")
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.8.21")

    }
}

allprojects {
    repositories {
        google()
       // mavenLocal()
        mavenCentral()
    }
}
