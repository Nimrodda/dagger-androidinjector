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

package org.codepond.daggersample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

import org.codepond.daggersample.feature.FeatureActivity
import org.codepond.daggersample.intro.IntroActivity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    fun startFeatureActivity(view: View) {
        val intent = Intent(this, FeatureActivity::class.java)
        intent.putExtra(FeatureActivity.EXTRA_SOME_ID, "id_1")
        startActivity(intent)
    }

    fun startIntroActivity(view: View) {
        val intent = Intent(this, IntroActivity::class.java)
        startActivity(intent)
    }
}
