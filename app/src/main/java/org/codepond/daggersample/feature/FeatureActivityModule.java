package org.codepond.daggersample.feature;

import android.app.Activity;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class FeatureActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(FeatureActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindFeatureActivityInjectorFactory(FeatureActivitySubComponent.Builder builder);

    @Binds
    abstract FeatureView provideFeatureView(FeatureActivity featureActivity);

    @Provides @Named("someId") static String provideSomeId(FeatureActivity featureActivity) {
        return featureActivity.someId;
    }
}
