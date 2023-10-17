# Guida all'installazione di Java su macOS

<p align="center">
<a href="https://angular.io/" target="_blank"><img src="data:image/png;base64,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" height="150"></a>

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
