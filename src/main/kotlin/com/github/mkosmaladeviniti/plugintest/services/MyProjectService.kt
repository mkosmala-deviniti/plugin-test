package com.github.mkosmaladeviniti.plugintest.services

import com.github.mkosmaladeviniti.plugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
