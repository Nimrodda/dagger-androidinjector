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

package org.codepond.daggersample.intro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import org.codepond.daggersample.R
import org.codepond.daggersample.analytics.AnalyticsLogger
import javax.inject.Inject

class TutorialFragment : DaggerFragment() {
    companion object {
        const val TAG = "TutorialFragment"
    }

    @Suppress("MemberVisibilityCanBePrivate")
    @Inject
    lateinit var analyticsLogger: AnalyticsLogger

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.tutorial_fragment, container, false)
    }

    override fun onStart() {
        super.onStart()
        analyticsLogger.logEvent("tutorialShown")
    }
}
