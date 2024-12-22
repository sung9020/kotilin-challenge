plugins {
    kotlin("jvm") version "1.9.25"
}

group = "me.sungmingyu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
sourceSets.main {
    java.srcDirs("src/main/java", "src/main/kotlin")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}