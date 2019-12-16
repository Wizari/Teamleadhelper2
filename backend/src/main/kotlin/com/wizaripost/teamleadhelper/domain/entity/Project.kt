package com.wizaripost.teamleadhelper.domain.entity

import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "projects")
data class Project(
        var name: String,
        var code: String): BaseEntity<Int>() {
}