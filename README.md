Calculator written in Java. ☕
# Math library
This calculator uses my math library for java: [`math-java`](https://github.com/aalaqily/math-java) to parse mathematical expressions and evaluate them, this repo just contains the frontend code, whether for CLI or GUI, so if you are looking for a Math library you better take a look at my Math library repo: [`math-java`](https://github.com/aalaqily/math-java).
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
You can also download prebuilt executable JARs from [GitHub Releases](https://github.com/aalaqily/calculator-java/releases) — you will find 2 executable JARs, one is a CLI calculator, and the other is a GUI calculator.
