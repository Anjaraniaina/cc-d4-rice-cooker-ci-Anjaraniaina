# Rice Cooker Kotlin

## Description
This is the implementation of the Rice Cooker project in Kotlin.

### Features:
The service for unchecked items is not implemented yet.
1. [x] Plug in
2. [x] Pour water
3. [x] Put ingredient
4. [x] Start
5. [x] Unplug

## Installation
If you already have a Kotlin environment set up, skip to the **How To Use**.

### Requirements
* [Kotlin](https://kotlinlang.org/docs/getting-started.html#install-kotlin): Follow the link to set up Kotlin.

## Standards and Conventions
The full Kotlin code style is [here](https://kotlinlang.org/docs/coding-conventions.html)

## Ktlint
### What?
Ktlint is a popular Kotlin static code analyzer and formatter.

### Installation
In Intellij IDEA, in a terminal, run:
```
./gradlew ktlintApplyToIdea addKtlintFormatGitPreCommitHook
```
### Usage
If you want to analyze your project, run:
```
./gradlew ktlintCheck
```
If you want to analyze and fix your project, run:
```
./gradlew ktlintFormat
```
## Testing
To run tests, use:
```
./gradlew test
```
