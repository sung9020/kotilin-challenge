plugins {
    kotlin("jvm") version "1.4.31"
}

group = "me.sungmingyu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
sourceSets.main {
    java.srcDirs("src/main/java", "src/main/kotlin")
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
}