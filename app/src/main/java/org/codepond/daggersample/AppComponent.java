package org.codepond.daggersample;

import org.codepond.daggersample.feature.FeatureActivityModule;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = { AndroidInjectionModule.class, AppModule.class, FeatureActivityModule.class })
public interface AppComponent {
    void inject(App app);
}
