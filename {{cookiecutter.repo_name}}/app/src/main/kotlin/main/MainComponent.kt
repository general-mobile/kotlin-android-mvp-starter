package {{ cookiecutter.package_name }}.main

import {{ cookiecutter.package_name }}.di.component.ApplicationComponent
import {{ cookiecutter.package_name }}.di.scope.ActivityScope
import dagger.Component


@ActivityScope
@Component(modules = arrayOf(MainModule::class), dependencies = arrayOf(ApplicationComponent::class))
interface MainComponent {
    fun inject(activity: MainActivity)
}