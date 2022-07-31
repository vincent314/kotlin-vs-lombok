plugins {
    id("java")
    id("io.freefair.lombok") version "6.5.0.3"
}

group = "me.vincent"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.24")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation("org.assertj:assertj-core:3.23.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
