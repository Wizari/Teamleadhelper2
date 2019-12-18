package com.wizaripost.teamleadhelper.domain.entity

import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "employees")
class Employee(var firstName: String? = null,
               var lastName: String? = null): AbstractEntity<Int>() {
}