plugins {
    id("com.android.application")

}

android {
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "dev.b3nedikt.viewpump.example"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(project(":viewpump"))
    implementation(Dependencies.appCompat)
    implementation(Dependencies.applocale)
}
