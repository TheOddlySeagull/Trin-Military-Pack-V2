<div align="center">

# Trin Military Pack V2 (id: iv_tmp)

Immersive Vehicles (MTS/IV) content pack focused on military vehicles, parts, and themed assets.

</div>

[![Discord](https://img.shields.io/badge/Discord-join-7289DA?logo=discord&logoColor=white)](https://discord.gg/ujQR3wf)
[![Build Status](https://github.com/TheOddlySeagull/Trin-Military-Pack-V2/actions/workflows/build.yml/badge.svg)](https://github.com/TheOddlySeagull/Trin-Military-Pack-V2/actions/workflows/build.yml)

Version: V2.0.0

## Overview

This pack contains military-themed vehicles and assets split out from the Vehicle Pack into a dedicated repository. It targets Minecraft 1.12.2 and 1.16.5.

## Download

- GitHub Actions artifacts: each CI run uploads JARs for 1.12.2 and 1.16.5.
- Releases: push a tag (e.g., `v2.0.0`) to trigger a release with attached JARs.

## Requirements

- Minecraft with Immersive Vehicles (MTS/IV)
- Trin Part Pack (recommended)

## Installation (Players)

1. Install Immersive Vehicles (MTS/IV).
2. Download this pack’s JAR for your MC version.
3. Place it into your `mods` folder.
4. Launch the game.

## Building (Developers)

Prereqs:
- JDK 8
- Git and Gradle wrapper (included)

Build tasks:
- `buildForge1122`
- `buildForge1165`
- `buildForgeAll`

Artifacts are copied to `out//` with the pack name and version.

CI:
- GitHub Actions builds on push/PR, uploads artifacts, and publishes releases on tags.

## Changelog

See [CHANGELOG.md](./CHANGELOG.md) for version history.

## License & Credits

- Content and branding © TheOddlySeagull and contributors. All rights reserved unless otherwise stated.
- Immersive Vehicles by its respective authors.

## Community

- Discord: https://discord.gg/ujQR3wf
- Issues: Use this repo’s Issues for bugs and feature requests.
