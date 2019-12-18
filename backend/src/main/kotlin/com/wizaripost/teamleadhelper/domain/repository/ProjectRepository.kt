package com.wizaripost.teamleadhelper.domain.repository

import com.wizaripost.teamleadhelper.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository: JpaRepository<Project, Int> {
}