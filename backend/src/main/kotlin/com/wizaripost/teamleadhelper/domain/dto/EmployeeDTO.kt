package com.wizaripost.teamleadhelper.domain.dto

import com.wizaripost.teamleadhelper.domain.entity.AbstractEntity
import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "employeesdto")
class EmployeeDTO(
        var firstName: String? = null,
        var lastName: String? = null) : AbstractEntity<Int>() {
}
