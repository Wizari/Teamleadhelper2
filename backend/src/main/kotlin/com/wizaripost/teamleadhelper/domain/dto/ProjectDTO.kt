package com.wizaripost.teamleadhelper.domain.dto

import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "projectsdto")
class ProjectDTO(
        var name: String? = null,
        var code: String? = null
) : AbstractDTO<Int>()