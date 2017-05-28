/*
 * Copyright 2017 Nimrod Dayan CodePond.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codepond.daggersample;

import org.codepond.daggersample.feature.FeatureActivity;
import org.codepond.daggersample.feature.FeatureModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * This module contains all the binding to the sub component builders in the app
 */
@Module
public abstract class BuildersModule {
    @ContributesAndroidInjector(modules = { FeatureModule.class })
    public abstract FeatureActivity contributeFeatureActivityInjector();
}
