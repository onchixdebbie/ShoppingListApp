plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "hoods.com.jetshopping"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xjvm-default=compatibility")
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation ("androidx.core:core-ktx:1.12.0")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.compose.ui:ui:1.5.1")
    implementation ("androidx.compose.material:material:1.5.1")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.5.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation ("androidx.activity:activity-compose:1.7.2")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:1.5.1")
    debugImplementation ("androidx.compose.ui:ui-tooling:1.5.1")

    // Compose dependencies
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
    implementation ("androidx.navigation:navigation-compose:2.7.2")
    implementation ("androidx.compose.material:material-icons-extended:1.5.1")
    implementation ("androidx.hilt:hilt-navigation-compose:1.0.0")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.48")
    kapt ("com.google.dagger:hilt-android-compiler:2.48")
    implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    kapt ("androidx.hilt:hilt-compiler:1.0.0")

    // Room
    implementation ("androidx.room:room-runtime:2.5.2")
    kapt ("androidx.room:room-compiler:2.5.2")

    // Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:2.5.2")
}
