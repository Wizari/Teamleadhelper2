package com.wizaripost.teamleadhelper.service

import com.wizaripost.teamleadhelper.domain.dto.ProjectDTO
import com.wizaripost.teamleadhelper.domain.entity.Project
import com.wizaripost.teamleadhelper.domain.repository.ProjectRepository
import com.wizaripost.teamleadhelper.exceptions.BadParamsException
import com.wizaripost.teamleadhelper.service.form.CreateProjectForm
import org.springframework.stereotype.Service

@Service
class ProjectServiceImpl(val projectRepository: ProjectRepository): ProjectService {
    override fun create(form: CreateProjectForm): ProjectDTO {
        val project = Project(form.name, form.code)
        this.projectRepository.save(project)
        return convert(project)
    }

    override fun delete(id: Int): ProjectDTO {
        val delEntity = projectRepository.getOne(id)
        this.projectRepository.deleteById(id)
        return convert(delEntity)
    }

    override fun getAll(): List<ProjectDTO> {
        return this.projectRepository.findAll().map { project -> convert(project) }
    }

    override fun getOne(id: Int): ProjectDTO {
        return convert(this.projectRepository.getOne(id))    }

    override fun update(dto: ProjectDTO): ProjectDTO {
        var project = this.projectRepository.getOne(dto.id!!)
        project.name = dto.name
        project.code = dto.code
        this.projectRepository.save(project)
        return this.convert(project)
    }

    fun convert(project: Project): ProjectDTO {
        var projectDTO = ProjectDTO(project.name, project.code)
        projectDTO.id = project.id
        return projectDTO
    }
}