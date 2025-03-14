/*
 * Kotlin
 *
 * Copyright 2023-2025 MicroEJ Corp. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found with this software.
 */
plugins {
    id("com.microej.gradle.application") version libs.versions.microej.sdk
}

group = "com.microej.example.eclasspath"
version = "3.2.0"

microej {
    applicationEntryPoint = "com.microej.example.eclasspath.logging.ExampleLogging"
    skippedCheckers = "nullanalysis"
}

dependencies {
    /*
     * Put your project dependencies here. An example of project dependency declaration is provided below:
     *
     * implementation("[org]:[otherArtifact]:[M.m.p]")
     * e.g.: implementation("ej.library.runtime:basictool:1.7.0")
     */
    implementation(libs.api.edc)
    implementation(libs.library.logging)

    /*
     * Put your test dependencies here. An example of test dependency declaration is provided below:
     *
     * testImplementation("[org]:[otherArtifact]:[M.m.p]")
     * e.g.: testImplementation("ej.library.test:junit:1.7.1")
     */

    /*
     * To use a VEE Port published in an artifact repository use this VEE Port dependency.
     */
    microejVee(libs.vee.port.nxp.mimxrt1170)
}