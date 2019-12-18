package com.wizaripost.teamleadhelper.service

import com.wizaripost.teamleadhelper.domain.dto.ProjectDTO
import com.wizaripost.teamleadhelper.service.form.CreateProjectForm

interface ProjectService {
    fun create(form: CreateProjectForm): ProjectDTO
}