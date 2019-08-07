object Versions {
    const val androidGradlePlugin = "3.3.0"
    const val detekt = "1.0.0-RC14"
    const val gson = "2.8.0"
    const val junit = "4.12"
    const val kotlin = "1.3.41"
    const val kotlinxCoroutines = "1.2.1"
    const val ktor = "1.2.2"
    const val mockitoKotlin = "2.1.0"
    const val serialization = "0.11.1"
    const val okhttp = "4.0.1"
}

object Libs {
    const val appcompat = "androidx.appcompat:appcompat:1.0.2"
    const val cardview = "androidx.cardview:cardview:1.0.0"
    const val recyclerview = "androidx.recyclerview:recyclerview:1.0.0"
    const val material = "com.google.android.material:material:1.0.0"
    const val constraintlayout = "com.android.support.constraint:constraint-layout:1.1.3"

    const val junit = "junit:junit:${Versions.junit}"

    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"

    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlinStdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlin}"

    const val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
    const val kotlinTestCommon = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
    const val kotlinTestJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"

    const val kotlinxCoroutinesCoreCommon = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.kotlinxCoroutines}"
    const val kotlinxCoroutinesCoreNative = "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:${Versions.kotlinxCoroutines}"
    const val kotlinxCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}"
    const val kotlinxCoroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinxCoroutines}"

    const val kotlinxSerializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serialization}"
    const val kotlinxSerializationRuntimeCommon = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.serialization}"
    const val kotlinxSerializationRuntimeNative = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:${Versions.serialization}"
    
    const val ktorClientAuth = "io.ktor:ktor-client-auth:${Versions.ktor}"

    const val ktorClientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
    const val ktorClientJsonJvm = "io.ktor:ktor-client-json-jvm:${Versions.ktor}"
    const val ktorClientJsonNative = "io.ktor:ktor-client-json-native:${Versions.ktor}"

    const val ktorClientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
    const val ktorClientSerializationNative = "io.ktor:ktor-client-serialization-native:${Versions.ktor}"
    const val ktorClientSerializationJvm = "io.ktor:ktor-client-serialization-jvm:${Versions.ktor}"

    const val ktorClientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
    const val ktorClientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
    const val ktorClientIos = "io.ktor:ktor-client-ios:${Versions.ktor}"

    const val ktorClientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
    const val ktorClientLoggingJvm = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"
    const val ktorClientLoggingNative = "io.ktor:ktor-client-logging-native:${Versions.ktor}"

    const val ktorClientOkHttp = "io.ktor:ktor-client-okhttp:${Versions.ktor}"

    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"

    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
}
