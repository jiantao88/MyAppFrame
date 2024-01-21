plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.st3.lib_framework"
    compileSdk = Apps.compileSdk

    defaultConfig {
        minSdk = Apps.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    compileOnly(Libs.coreKtx)
    compileOnly(Libs.appcompat)
    compileOnly(Libs.material)

    compileOnly(Libs.gson)
    compileOnly(Libs.refreshLayout)
    compileOnly(Libs.tbssdk)

}