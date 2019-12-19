package com.wizaripost.teamleadhelper.domain.repository

import com.wizaripost.teamleadhelper.domain.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository: JpaRepository<Employee, Int> {
}