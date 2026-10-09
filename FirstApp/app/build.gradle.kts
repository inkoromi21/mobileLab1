plugins {
  id("com.android.application")
}

android {
  namespace = "com.example.firstapp"
  compileSdk = 37

  defaultConfig {
    applicationId = "com.example.firstapp"
    minSdk = 26
    targetSdk = 34
    versionCode = 1
    versionName = "1.0"
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
}
