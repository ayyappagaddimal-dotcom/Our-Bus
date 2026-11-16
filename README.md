# MyBus – One App. Every Bus. Every Language.

Native Android (Kotlin, Jetpack Compose, Material 3, MVVM). Package `com.mybus.india`, minSdk 24, targetSdk 34, Java/Kotlin 17.

## Status (please read)
This is a **foundation/prototype**, not the full spec, and it has **not been build-tested** by its author.
Implemented: language picker (22 languages, per-app locale, RTL via supportsRtl), bottom navigation, demo passenger search (labelled DEMO),
driver screen with admin-approval gate + foreground GPS service, admin approve/reject, owner add-bus (pending verification), light/dark theme.
Translated UI strings: English, Hindi, Kannada, Tamil, Telugu, Urdu. Other languages currently fall back to English; add `res/values-<tag>/strings.xml` (have native speakers review).
Not yet implemented: real auth, backend, live map, ETA, notifications, favorites/recents, document upload, onboarding/splash, reports.

## Upload to GitHub
1. Create a new empty repository on github.com.
2. Push ALL contents of this folder, including the hidden `.github` folder:
   `git init && git add -A && git commit -m "init" && git branch -M main && git remote add origin <REPO_URL> && git push -u origin main`
3. Go to **Actions → Build APK → Run workflow** (it also runs on every push to `main`).
4. When the run finishes, open it and download the artifact **MyBus-debug-apk** (contains `app-debug.apk`).

## Gradle wrapper
`gradle-wrapper.jar` and `gradlew` are not in this ZIP (binaries can't be generated offline). The workflow creates them automatically.
Locally: `gradle wrapper --gradle-version 8.9`, or just open the project in Android Studio.

## Install the APK
Unzip the artifact, copy `app-debug.apk` to your phone, allow "Install unknown apps" for your file manager, and tap the file.

## Backend / external services
- Auth + data: Firebase Auth and Firestore/Realtime DB (add `google-services.json` + google-services plugin) or your own REST API.
- Live map: Google Maps SDK (`maps-compose`) with a key kept in `local.properties` – never commit keys.
- Push notifications: Firebase Cloud Messaging.
- Security: enforce driver approval and roles in backend rules; the in-app check is not sufficient. Create the first admin via the console/custom claims, not hardcoded credentials.
