package codepond.org.daggersample;

import codepond.org.daggersample.feature.FeatureActivityModule;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = { AndroidInjectionModule.class, AppModule.class, FeatureActivityModule.class })
public interface AppComponent {
    void inject(App app);
}
