package com.wizaripost.teamleadhelper.service

import com.wizaripost.teamleadhelper.domain.dto.ProjectDTO
import com.wizaripost.teamleadhelper.domain.entity.Project
import com.wizaripost.teamleadhelper.domain.repository.ProjectRepository
import com.wizaripost.teamleadhelper.service.form.CreateProjectForm
import org.springframework.stereotype.Service

@Service
class ProjectServiceImpl(val projectRepository: ProjectRepository): ProjectService {
    override fun create(form: CreateProjectForm): ProjectDTO {
        val project = Project(form.name, form.code)
        projectRepository.save(project)
        return convert(project)
    }


    fun convert(project: Project): ProjectDTO {
        var projectDTO = ProjectDTO(project.name, project.code)
        projectDTO.id = project.id
        return projectDTO
    }
}