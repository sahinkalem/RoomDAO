plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "sahinkalem.roomdao"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "sahinkalem.roomdao"
        minSdk = 28
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.room.common.jvm)
    implementation(libs.room.runtime)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    annotationProcessor(libs.room.compiler)

   implementation ("com.google.code.gson:gson:2.10.1") // Or the latest version
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")


    //Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
}