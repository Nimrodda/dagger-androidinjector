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

package org.codepond.daggersample.feature

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import org.codepond.daggersample.R
import org.codepond.daggersample.analytics.AnalyticsLogger
import javax.inject.Inject


@Suppress("MemberVisibilityCanBePrivate")
class FeatureActivity : DaggerAppCompatActivity(), FeatureView {
    @Inject
    internal lateinit var presenter: FeaturePresenter

    @Inject
    internal lateinit var analyticsLogger: AnalyticsLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature_activity)
    }

    override fun onStart() {
        super.onStart()
        analyticsLogger.logEvent("onStart")
        presenter.onStart()
    }

    override fun showFoos(id: String, foos: List<Foo>) {
        // Called by the presenter to show Foos
    }

    companion object {
        const val EXTRA_SOME_ID = "some_id"
    }
}
