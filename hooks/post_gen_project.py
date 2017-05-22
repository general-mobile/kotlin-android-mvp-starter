#!/usr/bin/env python
# -*- coding: utf-8 -*-

import os
import shutil

project_dir = os.getcwd()

package_dir = '{{ cookiecutter.package_name }}'.replace('.', '/')

os.chdir(os.path.join("app","src","androidTest","java"))
os.makedirs(package_dir)
shutil.move('ApplicationTest.java', package_dir + '/ApplicationTest.java')

os.chdir(os.path.join(project_dir,"app","src","main","kotlin"))
os.makedirs(package_dir)


os.chdir(os.path.join(project_dir,"app","src","test","java"))
os.makedirs(package_dir)
shutil.move('ExampleUnitTest.java', package_dir + '/ExampleUnitTest.java')

os.chdir(os.path.join(project_dir,"app","src","main","kotlin",package_dir))
os.chdir(os.path.join(project_dir,"app","src","main","kotlin"))

root_dst_dir = os.path.join(project_dir,"app","src","main","kotlin",package_dir)
root_src_dir = os.path.join(project_dir,"app","src","main","kotlin")

if '{{ cookiecutter.splash_screen }}' != 'y':
    shutil.rmtree('splash')

if '{{ cookiecutter.retrofit }}' != 'y':
    os.remove('di/module/NetModule.kt')

if '{{ cookiecutter.realm }}' != 'y':
    os.remove('di/module/DatabaseModule.kt')


base = os.path.join(root_src_dir,"base")
di = os.path.join(root_src_dir,"di")
splash = os.path.join(root_src_dir,"splash")
utils = os.path.join(root_src_dir,"utils")
main = os.path.join(root_src_dir,"main")

shutil.move('Application.kt',os.path.join(project_dir,"app","src","main","kotlin",package_dir,"Application.kt"))

def moverecursively(source_folder, destination_folder):
    basename = os.path.basename(source_folder)
    dest_dir = os.path.join(destination_folder, basename)
    if not os.path.exists(dest_dir):
        shutil.move(source_folder, destination_folder)
    else:
        dst_path = os.path.join(destination_folder, basename)
        for root, dirs, files in os.walk(source_folder):
            for item in files:
                src_path = os.path.join(root, item)
                if os.path.exists(dst_file):
                    os.remove(dst_file)
                shutil.move(src_path, dst_path)
            for item in dirs:
                src_path = os.path.join(root, item)
                moverecursively(src_path, dst_path)

moverecursively(base,root_dst_dir)
moverecursively(di,root_dst_dir)
moverecursively(utils,root_dst_dir)
moverecursively(main,root_dst_dir)

if '{{ cookiecutter.splash_screen }}' == 'y':
    moverecursively(splash,root_dst_dir)
