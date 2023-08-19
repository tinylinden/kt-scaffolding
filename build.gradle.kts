plugins {
    kotlin("jvm") version "1.9.0"
    id("com.adarshr.test-logger") version "3.1.0"
}

group = "pl.tinylinden"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.24.2")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
