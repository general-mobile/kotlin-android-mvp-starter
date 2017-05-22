package {{ cookiecutter.package_name }}.di.component

import android.content.Context
import android.content.SharedPreferences
import {{ cookiecutter.package_name }}.Application
import {{ cookiecutter.package_name }}.di.module.ApplicationModule
{% if cookiecutter.realm == "y" %}
import {{ cookiecutter.package_name }}.di.module.DatabaseModule
{% endif %}
{% if cookiecutter.retrofit == "y" %}
import {{ cookiecutter.package_name }}.di.module.NetModule
{% endif %}
import dagger.Component
import javax.inject.Singleton

@Singleton
{% if cookiecutter.retrofit == "n" and cookiecutter.realm == "n" %}
@Component(modules = arrayOf(ApplicationModule::class))
{% endif %}
{% if cookiecutter.retrofit == "y" and cookiecutter.realm == "y" %}
@Component(modules = arrayOf(ApplicationModule::class,NetModule::class,DatabaseModule::class))
{% endif %}
{% if cookiecutter.realm == "y" and cookiecutter.retrofit == "n" %}
@Component(modules = arrayOf(ApplicationModule::class,DatabaseModule::class))
{% endif %}
{% if cookiecutter.realm == "n" and cookiecutter.retrofit == "y" %}
@Component(modules = arrayOf(ApplicationModule::class,NetModule::class))
{% endif %}

interface ApplicationComponent {
    fun app(): Application

    fun context(): Context

    fun preferences(): SharedPreferences
}
