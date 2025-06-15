// Top-level build file
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Обязательно указываем версии плагинов здесь
        classpath("com.android.tools.build:gradle:8.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")
    }
}

plugins {
    // Плагины с apply=false будут применены в модулях

    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

