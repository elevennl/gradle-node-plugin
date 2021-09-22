# DEPRECATED
This plugin has been deprecated and will not receive any updates. It's only purpose is outlined below. This plugin will not work with Gradle 7+.
As an alternative we recommend using [node-gradle/gradle-node-plugin](https://github.com/node-gradle/gradle-node-plugin)
This should be an easy replacement but the `GulpTask` has been removed in favor of the `NpxTask`.

# What is the purpose of this fork?
This is a fork of the [srs/gradle-node-plugin](https://github.com/srs/gradle-node-plugin) but with added support for Gradle 6+ from [node-gradle/gradle-node-plugin](https://github.com/node-gradle/gradle-node-plugin), while still maintaining support for Gulp and Grunt (We still needed this functionality for now)

A lot of thanks goes out to them for making/updating this plugin. 

# Gradle Plugin for Node

This plugin enabled you to use a lot of [NodeJS](https://nodejs.org)-based technologies as part of your 
build without having NodeJS installed locally on your system. It integrates the following NodeJS-based system
with Gradle:

* [NodeJS](https://nodejs.org)
* [Yarn](https://yarnpkg.com/)
* [Grunt](https://gruntjs.com/)
* [Gulp](https://gulpjs.com/)

## Documentation

Here's how you get started using this plugin.

* [Installing](docs/installing.md)
* [Node Plugin](docs/node.md)
* [Grunt Plugin](docs/grunt.md)
* [Gulp Plugin](docs/gulp.md)
* [FAQ](docs/faq.md)

## Building the Plugin

To build the plugin, just type the following command:

```bash
./gradlew clean build
```
