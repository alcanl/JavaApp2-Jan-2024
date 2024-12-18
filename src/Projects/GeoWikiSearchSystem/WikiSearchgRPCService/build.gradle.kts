plugins {
	java
	id("org.springframework.boot") version "3.3.0"
	id("io.spring.dependency-management") version "1.1.5"
}

group = "org.csystem"
version = "1.0.0"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
	mavenLocal()
	maven {
		url = uri("https://raw.github.com/oguzkaran/javaapp1-nov-2023-maven-repo/main")
	}

	maven {
		url = uri("https://raw.github.com/oguzkaran/javaapp2-jan-2024-karandev-maven-repo/main")
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("net.devh:grpc-server-spring-boot-starter:3.1.0.RELEASE")
	implementation("org.modelmapper:modelmapper:3.2.1")
	implementation("org.csystem:org-csystem-util-grpc:1.0.0")
	implementation("org.csystem:org-csystem-util-data:1.0.0")
	implementation("org.csystem:GeonamesWikiSearchServiceLib:1.0.0")
	implementation("org.csystem:GeoWikiSearchProtoLib:1.0.0")
	implementation("org.csystem:GeoRepositoryLib:1.0.0")
	implementation("org.postgresql:postgresql:42.7.4")
	implementation("com.h2database:h2")
	compileOnly("org.projectlombok:lombok:1.18.34")
	annotationProcessor("org.projectlombok:lombok")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	testImplementation("net.devh:grpc-client-spring-boot-autoconfigure:2.15.0.RELEASE")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
