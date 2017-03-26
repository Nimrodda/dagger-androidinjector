package codepond.org.daggersample.feature;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class FeatureActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(FeatureActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindFeatureActivityInjectorFactory(FeatureActivitySubComponent.Builder builder);
}
