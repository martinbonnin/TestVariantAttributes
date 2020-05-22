buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.3")
    }
}

apply(plugin = "com.android.library")

configure<com.android.build.gradle.BaseExtension> {
    compileSdkVersion(28)
}

repositories {
    jcenter()
}

dependencies {
    add("implementation", "com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0")
}