package {{ cookiecutter.package_name }}.main

import javax.inject.Inject


class MainPresenter @Inject
constructor(private val view: IMainView)