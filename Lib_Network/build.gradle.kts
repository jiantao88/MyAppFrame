plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.st3.lib_network"
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
}

dependencies {

    compileOnly(Libs.coreKtx)
    compileOnly(Libs.appcompat)
    compileOnly(Libs.material)

    compileOnly(Libs.retrofit2)
    compileOnly(Libs.retrofit2ConverterGson)
    compileOnly(Libs.loggingInterceptor)

    compileOnly(Libs.gson)
    compileOnly(Libs.liveDataKtx)
    compileOnly(Libs.viewModelKtx)
    compileOnly(Libs.mmkv)

    compileOnly(project(":Lib_framework"))

    testImplementation("junit:junit:4.14-SNAPSHOT")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}