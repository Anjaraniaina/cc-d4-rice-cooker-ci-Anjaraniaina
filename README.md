# Rice Cooker Ruby

## Description
This is the implementation of the Rice Cooker project in Ruby.
### Features:
The service for unchecked item are not implemented yet.
1. [x] Plug in
2. [x] Pour water
3. [x] Put ingredient
4. [x] Start
5. [x] Unplug

## Installation
If you already have a Ruby environment set-up, skip to the **How To use**.
### Requirements
* [Ruby](https://rubyinstaller.org/): follow the link to download and install ruby.

## Standards and Conventions
The full Ruby code style is [here](https://rubystyle.guide/)

## RuboCop
### What ?
It's a popular Ruby static code analyzer and formatter
### Installation
In a terminal, run:
```
gem install rubocop
```
### Usage
If you want to just analyse your ruby files or the entire directory, run:
```
rubocop /lib
```
If you want to analyse and fix it, run:
```
rubocop --auto-correct /lib
```

## How to use ?
If you don't have an IDE but have a ruby setup, from the root directory just run:
```
ruby ./lib/main.rb
```

## Testing
To run a test, use:
```
ruby ./lib/main.rb
```