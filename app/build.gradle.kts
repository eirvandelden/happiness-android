plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "family.vandelden.happiness"
    compileSdk = 36

    defaultConfig {
        applicationId = "family.vandelden.happiness"
        minSdk = 28
        targetSdk = 36
        versionCode = 1
        versionName = "0.1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        }
    }
}

dependencies {
    implementation(libs.hotwire.core)
    implementation(libs.hotwire.navigation.fragments)
}
