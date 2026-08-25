# Happiness for Android

A Hotwire Native wrapper around [happiness.vandelden.family](https://happiness.vandelden.family).
The web app is the whole app; this project is the shell that puts it on a phone.

## Build and install

```sh
export JAVA_HOME="/Applications/Android Studio.app/Contents/jbr/Contents/Home"
./gradlew assembleDebug
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

The APK is signed with the local debug key, which is enough to sideload onto your own device.

## Navigation rules

`app/src/main/assets/json/configuration.json` decides how each path is presented.
It is bundled in the APK, so changing a rule currently needs a new build.
