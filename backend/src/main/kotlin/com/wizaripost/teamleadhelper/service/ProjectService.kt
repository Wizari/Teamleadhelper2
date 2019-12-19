package com.wizaripost.teamleadhelper.service

import com.wizaripost.teamleadhelper.domain.dto.ProjectDTO
import com.wizaripost.teamleadhelper.service.form.CreateProjectForm

interface ProjectService {
    fun create(form: CreateProjectForm): ProjectDTO

    fun update(dto: ProjectDTO): ProjectDTO

    fun delete(id: Int): ProjectDTO

    fun getOne(id: Int): ProjectDTO

    fun getAll(): List<ProjectDTO>

}