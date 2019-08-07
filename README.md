[![CircleCI Badge](https://circleci.com/gh/wiyarmir/kotlin-multiplatform-mobile-template.svg?style=svg)](https://circleci.com/gh/wiyarmir/kotlin-multiplatform-mobile-template)
![Kotlin Version](https://img.shields.io/badge/kotlin-v1.3.40-F88909?style=flat&logo=kotlin)

# Kotlin Multiplatform Mobile Template

Template that will give you a ready-to-go project including:

- Android App project with KotlinJVM at [android/](/android)
- iOS App project with KotlinNative at [ios/](/ios)
- Shared network, domain and presentation at [common/](/common)

## Building and running the project

### Android

Open the root project in Android Studio or IntelliJ, and it will recognise the Android App configuration after a
successful Gradle sync. You can use that configuration to run, debug and profile the app.

### iOS

Open the workspace located at [ios/KotlinMultiplatformTemplate.xcworkspace](/ios/KotlinMultiplatformTemplate.xcworkspace) 
in XCode. The Podfile includes an entry to the common code with an extra user script for it to be recompiled as a build 
step.

## Contributing

If you would like to contribute code to this repository you can do so through GitHub by creating a new branch in the repository and sending a pull request or opening an issue. Please, remember that there are some requirements you have to pass before accepting your contribution:

* Write clean code and test it.
* The code written will have to match the product owner requirements.
* Follow the repository code style.
* Write good commit messages.
* Do not send pull requests without checking if the project build is OK in the CI environment.
* Review if your changes affects the repository documentation and update it.
* Describe the PR content and don't hesitate to add comments to explain us why you've added or changed something.

## License

    Copyright 2019 Kotlin Multiplatform Template

    Licensed under the Apache License, Version 2.0 (the "License"); you may 
    not use this file except in compliance with the License. You may obtain a 
    copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
    License for the specific language governing permissions and limitations 
    under the License.
