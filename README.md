# Language Learner (KMP)

A Kotlin Multiplatform language learning application supporting Android, iOS, Desktop (JVM), and Web (Wasm).

## Project Structure

- **composeApp**: Shared UI and logic used across all platforms.
- **androidApp**: Android-specific entry point and configuration.
- **iosApp**: Native iOS application (SwiftUI) consuming the shared module via SKIE.
- **desktopApp**: Desktop application entry point using Compose for Desktop.
- **webApp**: Web application entry point using Compose for Web (Wasm).

---

## 🌍 Web (Wasm)

### Run
To start the development server and run the app in your browser:
```bash
./gradlew :webApp:wasmJsBrowserDevelopmentRun
```

### Build & Distribute
To generate a production-ready distribution:
```bash
./gradlew :webApp:wasmJsBrowserDistribution
```
The output will be available in `webApp/build/dist/wasmJs/productionExecutable`.

---

## 🤖 Android

### Run
To install and run the debug version on a connected device/emulator:
```bash
./gradlew :androidApp:installDebug
```

### Build & Distribute
To build the release APK or AAB:
```bash
# For APK
./gradlew :androidApp:assembleRelease

# For App Bundle
./gradlew :androidApp:bundleRelease
```
Outputs are located in `androidApp/build/outputs/apk/release` or `androidApp/build/outputs/bundle/release`.

---

## 💻 Desktop (JVM)

### Run
To run the desktop application:
```bash
./gradlew :desktopApp:run
```

### Build & Distribute
To package the application for your current operating system:
```bash
./gradlew :desktopApp:package
```
Specific format tasks:
- **macOS (DMG)**: `./gradlew :desktopApp:packageDmg`
- **Windows (MSI)**: `./gradlew :desktopApp:packageMsi`
- **Linux (DEB)**: `./gradlew :desktopApp:packageDeb`

Outputs are located in `desktopApp/build/compose/binaries`.

---

## 🍎 iOS

### Run
1. Open the project root in a terminal.
2. Ensure you have Xcode installed.
3. Open `iosApp/LanguageLearner.xcodeproj` (or `.xcworkspace` if generated) in Xcode.
4. Select your target device/simulator and press **Cmd + R**.

### Build & Distribute
Distributing the iOS app follows the standard Apple workflow:
1. In Xcode, select **Product > Archive**.
2. Once the archive is complete, use the **Organizer** to distribute the app to TestFlight or the App Store.

---

## 🛠 Prerequisites

- **JDK 21+**: Required for the build system.
- **Android Studio**: Recommended for shared and Android development.
- **Xcode**: Required for iOS builds (macOS only).
- **Kotlin 2.3.21+**: The project uses the latest stable K2 compiler features.
