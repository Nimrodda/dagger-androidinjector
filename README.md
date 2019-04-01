Android Dagger AndroidInjector sample
=

This sample is part of a [tutorial](https://medium.com/@nimroddayan/android-and-dagger-2-10-androidinjector-5e9c523679a3) how to use the new [dagger-android](https://google.github.io/dagger/android) module, which was released in Dagger 2.10.

Dagger 2.10 introduced dagger-android, a new module specifically for Android that comes in addition to the main dagger module and compiler. In this tutorial we will go through the steps needed to get started with the new module — assuming you’re already familiar with Dagger.
This tutorial is focused on Activity injection, but might as well serve as a reference for other Android components.

The sample demonstrates key points when working with Dagger in the context of MVP:

* How to inject an Activity
* How to bind the activity where a View is requested
* How to bind @Named arguments that are passed from the activity and provide them in the Presenter
* How to utilize scopes

License
-


```
Copyright 2019 Nimrod Dayan nimroddayan.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
