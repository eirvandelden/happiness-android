# happiness-android

## What this is

A thin Hotwire Native shell around [happiness.vandelden.family](https://happiness.vandelden.family), so the web app installs as an Android app. The web app is the whole app; this project is only the wrapper that opens it in a native navigation host. There is no native business logic to speak of — one activity, one application class, one path-configuration JSON file.

## Domain

No domain nouns of its own; all domain logic lives in the web app this wraps. The only local concept is the Hotwire path configuration (`app/src/main/assets/json/configuration.json`), which decides how each URL path is presented (currently one catch-all rule rendering every path as the default web fragment with pull-to-refresh).

## Commands

```sh
export JAVA_HOME="/Applications/Android Studio.app/Contents/jbr/Contents/Home"
./gradlew assembleDebug        # build debug APK
adb install -r app/build/outputs/apk/debug/app-debug.apk   # install to a connected device
./gradlew lintDebug            # lint (also runs in CI)
```

No test suite exists yet.

## Gotchas

- `configuration.json` is bundled into the APK at build time, not fetched at runtime — changing a navigation rule needs a new build and reinstall, not just a web deploy.
- The debug APK is signed with the local debug key only; that's enough to sideload but not to distribute.
