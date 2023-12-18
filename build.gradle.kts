buildscript {
    repositories {
        google()
    }

    dependencies {
        classpath ("com.google.gms.google-services:com.google.gms.google-services.gradle.plugin:4.4.0")
        classpath("com.google.gms:google-services:4.4.0")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("com.android.library") version "7.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}