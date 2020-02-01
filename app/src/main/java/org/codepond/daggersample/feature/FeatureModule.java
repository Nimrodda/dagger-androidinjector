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

package org.codepond.daggersample.feature;

import org.codepond.daggersample.ActivityScope;
import javax.inject.Named;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Feature level module holds all the bindings needed for this feature scoped with {@link ActivityScope}
 */
@Module
abstract class FeatureModule {

    @ActivityScope
    @Binds
    abstract FeatureView provideFeatureView(FeatureActivity featureActivity);

    @ActivityScope
    @Provides
    @Named("someId")
    static String provideSomeId(FeatureActivity featureActivity) {
        return featureActivity.getIntent().getStringExtra(FeatureActivity.EXTRA_SOME_ID);
    }
}
