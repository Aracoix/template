package com.github.aracoix.template.services

import com.intellij.openapi.project.Project
import com.github.aracoix.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
