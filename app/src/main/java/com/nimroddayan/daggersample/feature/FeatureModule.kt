/*
 * Copyright 2020 Nimrod Dayan nimroddayan.com
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
package com.nimroddayan.daggersample.feature

import com.nimroddayan.daggersample.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Feature level module holds all the bindings needed for this feature scoped with [ActivityScope]
 */
@Module
internal abstract class FeatureModule {
    @ActivityScope
    @Binds
    abstract fun provideFeatureView(featureActivity: FeatureActivity): FeatureView

    companion object {
        @ActivityScope
        @Provides
        @Named("someId")
        fun provideSomeId(featureActivity: FeatureActivity): String {
            return featureActivity.intent.getStringExtra(FeatureActivity.EXTRA_SOME_ID)
        }
    }
}