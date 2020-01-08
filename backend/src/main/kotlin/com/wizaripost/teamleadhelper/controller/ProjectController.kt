package com.wizaripost.teamleadhelper.controller

import com.wizaripost.teamleadhelper.domain.dto.ProjectDTO
import com.wizaripost.teamleadhelper.service.ProjectService
import com.wizaripost.teamleadhelper.service.form.CreateProjectForm
import org.springframework.http.MediaType
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("api/projects")
class ProjectController(val projectService: ProjectService) {

    @PostMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun create(@RequestBody form: CreateProjectForm): ProjectDTO {
        return this.projectService.create(form)
    }

    @PostMapping("edit/{id}")
    fun update(@RequestBody dto: ProjectDTO) : ProjectDTO {
        return this.projectService.update(dto)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable(name = "id") id1: Int): ProjectDTO {
        return this.projectService.delete(id1)
    }

    @GetMapping("/list")
    fun getAll(model: Model): Collection<ProjectDTO> {
        return this.projectService.getAll()
    }

    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Int): ProjectDTO {
        return this.projectService.getOne(id)
    }
}