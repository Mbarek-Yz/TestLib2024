package com.example.testlib2024

class AndroidPlatform : Platform {
      override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()