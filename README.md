# Android Kotlin MVP Starter

[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/general-mobile/kotlin-android-mvp-starter/master/LICENSE)
[![Platform](https://img.shields.io/badge/platform-Android-green.svg)](http://developer.android.com/index.html)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android%20Kotlin%20MVP%20Starter-brightgreen.svg?style=flat)](https://android-arsenal.com/details/3/5791)

Android Kotlin Starter is a starter project which implements MVP Pattern.  

## Thanks
This project extends from [Deniz Tunç Tuncer](https://github.com/dtunctuncer)'s [Android Starter](https://github.com/dtunctuncer/android-mvp-starter) project

## Libraries
It includes libraries
- [RxJava2](https://github.com/ReactiveX/RxJava) and [RxAndroid](https://github.com/ReactiveX/RxAndroid) and [RxKotlin](https://github.com/ReactiveX/RxKotlin) 
- [Retrofit](http://square.github.io/retrofit/) / [OkHttp](http://square.github.io/okhttp/)
- [Gson](https://github.com/google/gson)
- [Dagger 2](http://google.github.io/dagger/)
- [Butterknife](https://github.com/JakeWharton/butterknife)
- [Timber](https://github.com/JakeWharton/timber)
- [Espresso](https://google.github.io/android-testing-support-library/) for UI tests
- [Crashlytics](https://try.crashlytics.com/)
- [Realm](https://realm.io/)
- [Picasso](http://square.github.io/picasso/)

**You can choose which library you want to include in your project**

![Terminal](art/example.png)

#### Requirements

[python](https://www.python.org/)  
[pip](https://pypi.python.org/pypi/pip)  
[cookiecutter](https://github.com/audreyr/cookiecutter)  

#### Install
```
1. Install python
2. Install pip
3. pip install cookiecutter
```

Scaffold your project:
```
cookiecutter https://github.com/general-mobile/kotlin-android-mvp-starter.git
```


##### Project Tree After Scaffold
```bash
.
├── app
│   ├── app.iml
│   ├── build.gradle
│   ├── proguard-rules.pro
│   └── src
│       ├── androidTest
│       │   └── java
│       │       └── com
│       │           └── generalmobile
│       │               └── app
│       │                   └── test
│       │                       └── ApplicationTest.java
│       ├── main
│       │   ├── AndroidManifest.xml
│       │   ├── kotlin
│       │   │   └── com
│       │   │       └── generalmobile
│       │   │           └── app
│       │   │               └── test
│       │   │                   ├── Application.kt
│       │   │                   ├── base
│       │   │                   │   ├── BaseActivity.kt
│       │   │                   │   └── IBaseView.kt
│       │   │                   ├── di
│       │   │                   │   ├── component
│       │   │                   │   │   └── ApplicationComponent.kt
│       │   │                   │   ├── module
│       │   │                   │   │   ├── ApplicationModule.kt
│       │   │                   │   │   ├── DatabaseModule.kt
│       │   │                   │   │   └── NetModule.kt
│       │   │                   │   └── scope
│       │   │                   │       └── ActivityScope.kt
│       │   │                   ├── main
│       │   │                   │   ├── IMainView.kt
│       │   │                   │   ├── MainActivity.kt
│       │   │                   │   ├── MainComponent.kt
│       │   │                   │   ├── MainModule.kt
│       │   │                   │   └── MainPresenter.kt
│       │   │                   ├── splash
│       │   │                   │   └── SplashActivity.kt
│       │   │                   └── utils
│       │   │                       ├── RxBus.kt
│       │   │                       └── timber
│       │   │                           └── CrashReportTree.kt
│       │   └── res
│       │       ├── drawable
│       │       │   ├── android_starter.png
│       │       │   └── splash_logo.xml
│       │       ├── layout
│       │       │   └── activity_main.xml
│       │       ├── menu
│       │       │   └── menu_main.xml
│       │       ├── mipmap-hdpi
│       │       │   ├── ic_launcher.png
│       │       │   └── ic_launcher_round.png
│       │       ├── mipmap-mdpi
│       │       │   ├── ic_launcher.png
│       │       │   └── ic_launcher_round.png
│       │       ├── mipmap-xhdpi
│       │       │   ├── ic_launcher.png
│       │       │   └── ic_launcher_round.png
│       │       ├── mipmap-xxhdpi
│       │       │   ├── ic_launcher.png
│       │       │   └── ic_launcher_round.png
│       │       ├── mipmap-xxxhdpi
│       │       │   ├── ic_launcher.png
│       │       │   └── ic_launcher_round.png
│       │       ├── values
│       │       │   ├── colors.xml
│       │       │   ├── dimens.xml
│       │       │   ├── strings.xml
│       │       │   └── styles.xml
│       │       ├── values-v21
│       │       │   └── styles.xml
│       │       └── values-w820dp
│       │           └── dimens.xml
│       └── test
│           └── java
│               └── com
│                   └── generalmobile
│                       └── app
│                           └── test
│                               └── ExampleUnitTest.java
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradle.properties
├── gradlew
├── gradlew.bat
├── local.properties
├── settings.gradle
└── test.iml

43 directories, 51 files
```


## License

    The MIT License (MIT)
    
    Copyright (c) 2017 General Mobile
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
