Calculator written in Java. ☕
# Build
You need [Gradle](https://gradle.org/install/) to build this calculator, once you install Gradle you can build 2 executable JARs:

- a CLI calculator:
```
./gradlew jarCLI
```
- a GUI calculator:
```
./gradlew jarGUI
```

You can find built executable JARs at `build/libs` directory.

And you can run them by executing this command in terminal (assuming you are in `build/libs` directory):
```
java -jar calculator-[cli|gui].jar
```
# Install from GitHub Releases
You can also download prebuilt execuable JARs from [GitHub Releases](https://github.com/aalaqily/calculator-java/releases) — you will find 2 executable JARs, one is a CLI calculator, and the other is a GUI calculator.
