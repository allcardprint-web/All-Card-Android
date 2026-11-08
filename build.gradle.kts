plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

// google-services.json (Firebase Console se download) app/ folder me rakhte hi Firebase plugin apne-aap judd jata hai
if (file("google-services.json").exists()) {
    apply(plugin = "com.google.gms.google-services")
}

android {
    namespace = "com.allcard.digitalservices"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.allcard.digitalservices"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    signingConfigs {
        create("allcard") {
            storeFile = file("allcard.jks")
            storePassword = "allcard123"
            keyAlias = "allcard"
            keyPassword = "allcard123"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("allcard")
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        debug {
            signingConfig = signingConfigs.getByName("allcard")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.webkit:webkit:1.11.0")
    implementation("androidx.core:core-splashscreen:1.0.1")

    if (file("google-services.json").exists()) {
        implementation(platform("com.google.firebase:firebase-bom:33.1.2"))
        implementation("com.google.firebase:firebase-analytics")
    }
}
