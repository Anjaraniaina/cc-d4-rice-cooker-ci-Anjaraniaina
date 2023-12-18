# Rice Cooker Go

## Description
This is the implementation of the Rice Cooker project in Go.
### Features:
The service for unchecked item are not implemented yet.
1. [x] Plug in
2. [x] Pour water
3. [x] Put ingredient
4. [x] Start
5. [x] Unplug

## Installation
If you already have a Go environment set-up, skip to the **How To use**.
### Requirements
* [Go](https://go.dev/doc/install): follow the link to download and install Go for your operating system.

## Standards and Conventions
The full Go code style is [here](https://google.github.io/styleguide/go/)

## golangci-lint
### What ?
It's the most popular linter for Go.  
### Installation
To install golangci-lint, follow this [link](https://golangci-lint.run/usage/install/).
### Usage
Checkstyle take in the parameter a xml file describing the style, this project use [Google Go Style Guide](https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml).
To analyse, format and obtain report from your code, in the project root directory, run:
```
golangci-lint run
```

## How to use ?
If you don't have an IDE but have a Go setup, from the root directory just run the command:
```
go run cmd\ricecooker\main.go 
```

## How to test ?
First, get assertions to make test easier:
```
go get github.com/stretchr/testify/assert
```
This command will run all tests in test/unit:
```
go test ./test/unit/...
```