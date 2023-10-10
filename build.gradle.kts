plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    testImplementation ("org.junit:junit:4.13")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.0")

//    testImplementation(platform("org.junit:junit-bom:5.9.1"))
//    testImplementation("org.junit.jupiter:junit-jupiter")

}

tasks.test {
    useJUnit()
//    useTestNG()
}