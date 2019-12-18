package com.wizaripost.teamleadhelper.controller

import com.wizaripost.teamleadhelper.domain.dto.ProjectDTO
import com.wizaripost.teamleadhelper.service.ProjectService
import com.wizaripost.teamleadhelper.service.form.CreateProjectForm
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/projects")
class ProjectController(val projectService: ProjectService) {

    @PostMapping
    fun create(@RequestBody form: CreateProjectForm): ProjectDTO {
        return this.projectService.create(form)
    }

}