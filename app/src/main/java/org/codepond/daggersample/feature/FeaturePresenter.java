/*
 * Copyright 2018 Nimrod Dayan CodePond.org
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
import org.codepond.daggersample.SomeService;
import org.codepond.daggersample.analytics.AnalyticsLogger;

import javax.inject.Inject;
import javax.inject.Named;

@ActivityScope
class FeaturePresenter {
    private final FeatureView featureView;
    private final String someId;
    private final SomeService someService;
    private final AnalyticsLogger analyticsLogger;

    @Inject
    FeaturePresenter(FeatureView featureView,
                     @Named("someId") String someId,
                     SomeService someService,
                     AnalyticsLogger analyticsLogger) {
        this.featureView = featureView;
        this.someId = someId;
        this.someService = someService;
        this.analyticsLogger = analyticsLogger;
    }

    void onStart() {
        if (someId != null) {
            analyticsLogger.logEvent("showFoo");
            featureView.showFoo(someId);
        }
    }
}
