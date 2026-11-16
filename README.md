# MyBus Android App

A Kotlin + Jetpack Compose starter application for a bus information and tracking product.

## Current status

This ZIP contains a buildable Android UI starter/prototype:
- Passenger, Driver and Admin mode navigation
- Bus route search UI
- 22 Indian scheduled-language choices
- Demo-mode notice
- Android location permission declarations

**Not yet implemented:** real authentication, backend/database, bus operator integrations, live GPS transmission, live maps, ETA calculations, push notifications, admin authorization, owner document verification, and complete translations. Do not treat demo UI as a live transport service.

## Build APK on GitHub (Android phone friendly)

1. Create a GitHub repository.
2. Extract this ZIP.
3. Upload the *contents* of the `MyBus` folder to the repository root, including the hidden `.github` folder.
4. Open the Actions tab.
5. Select **Build APK**, then **Run workflow** if it did not start automatically.
6. Open the successful workflow run.
7. Download the artifact named `MyBus-debug-apk`.
8. Extract the artifact ZIP and install `app-debug.apk` only if you trust the source.

The workflow installs Gradle 8.9 and Android SDK 35, then runs `gradle assembleDebug`. This avoids depending on a missing Gradle wrapper JAR in the ZIP.

## Local build

Requirements: JDK 17, Gradle 8.9, Android SDK 35.

Run:
```bash
gradle assembleDebug
```
APK:
`app/build/outputs/apk/debug/app-debug.apk`

The included `gradlew` and `gradlew.bat` are convenience launchers that call a locally installed `gradle`; they are not the official self-downloading Gradle Wrapper scripts.

## Backend and credentials needed for full product

A real deployment needs:
- Secure backend API and database
- User authentication and role-based authorization
- Admin-managed driver approval
- Bus/route/stop data source
- Map provider account and API key
- Secure GPS update endpoint
- Push notification service
- Privacy policy, consent and retention rules

Never put private service credentials or production secrets in source code or a public repository.
