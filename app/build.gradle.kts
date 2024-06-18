plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    // hilt 관련 추가(KAPT -> KSP)
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

kotlin {
    jvmToolchain(17)
}


android {
    namespace = "com.msjo.cleanarchitest"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.msjo.cleanarchitest"
        minSdk = 26
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
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

//    flavorDimensions += "version"
//    productFlavors {
//        create("mainflavor") {
//            buildConfigField("String", "BASE_URL", "http://api.stg.msjo.co.kr")
//        }
//        create("stg") {
//            buildConfigField("String", "BASE_URL", "http://api.stg.msjo.co.kr")
//        }
//    }

    compileOptions {
        // sourceCompatibility = JavaVersion.VERSION_1_8
        // targetCompatibility = JavaVersion.VERSION_1_8
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        // jvmTarget = "1.8"
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // 의존성 추가
    implementation(project(":domain"))
    implementation(project(":data"))


    // GSON
    implementation("com.google.code.gson:gson:2.9.1")

    // hilt
//    implementation("com.google.dagger:hilt-android:2.48")
//    ksp("com.google.dagger:hilt-android-compiler:2.48")
//    implementation("androidx.multidex:multidex:2.0.1")
//    implementation("androidx.hilt:hilt-navigation-compose:1.1.0")

    implementation ("com.google.dagger:hilt-android:2.51.1")
    ksp ("com.google.dagger:hilt-compiler:2.51.1")


    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")

    //okHttp
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")
}