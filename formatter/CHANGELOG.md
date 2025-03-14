# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## 2.2.0 - 2025-03-14

### Added

- Add ``Expected Behavior`` section in the README.

### Changed

- Use [NXP i.MX RT1170 VEE Port v3.0.0](https://github.com/MicroEJ/nxp-vee-imxrt1170-evk/tree/NXPVEE-MIMXRT1170-EVK-3.0.0) by default.
- Define ``build.gradle.kts`` dependencies in [libs.versions.toml](../gradle/libs.versions.toml).
- Update README to use IntelliJ IDEA.
- Update ``com.microej.gradle.application`` plugin version to `1.1.0`.
- Update ``common.properties`` configuration file to latest template version.

### Removed

- Remove ``bsp_connection.properties`` configuration file, now included in ``common.properties``.

## 2.1.0 - 2025-02-24

### Changed

 - Update ``com.microej.gradle.application`` plugin version to `1.0.0`.

## 2.0.0 - 2024-01-26

### Changed

 - Update to MicroEJ SDK 6 and switch from Ivy to Gradle.
 - Use try-with-resource to handle closing of Formatter.

## 1.1.0 - 2019-08-26

### Changed

  - Update to MicroEJ 5.1.
  - Use Firmware Single App build type.

## 1.0.0

### Added

  - Initial revision.

---  
_Markdown_   
_Copyright 2019-2025 MicroEJ Corp. All rights reserved._   
_Use of this source code is governed by a BSD-style license that can be found with this software._  