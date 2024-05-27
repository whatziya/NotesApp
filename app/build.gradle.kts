plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.notesapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.notesapp"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation( "androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.0")
    implementation( "androidx.lifecycle:lifecycle-runtime-ktx:2.8.0")
    implementation( "androidx.lifecycle:lifecycle-livedata-ktx:2.8.0")

    // Room
    implementation( "androidx.room:room-runtime:2.6.1")
    kapt( "androidx.room:room-compiler:2.6.1")

    // Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:2.6.1")

    // Navigation Components
    implementation( "androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation( "androidx.navigation:navigation-ui-ktx:2.7.7")
    implementation( "androidx.navigation:navigation-dynamic-features-fragment:2.7.7")

    // Espresso
    androidTestImplementation( "androidx.test.espresso:espresso-contrib:$3.3.0")

    // Mockk.io
    androidTestImplementation( "io.mockk:mockk-android:1.9.3")

    // androidx.test
    androidTestImplementation( "androidx.test:runner:1.5.2")
    androidTestImplementation( libs.androidx.core)
    androidTestImplementation( "androidx.test.ext:junit-ktx:1.1.5")

    // androidx.fragment
    debugImplementation( "androidx.fragment:fragment-testing:1.7.1")
    implementation( "androidx.fragment:fragment-ktx:1.7.1")
}