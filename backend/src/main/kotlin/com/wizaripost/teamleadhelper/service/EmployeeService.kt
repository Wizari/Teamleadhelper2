package com.wizaripost.teamleadhelper.service

import com.wizaripost.teamleadhelper.domain.dto.EmployeeDTO
import com.wizaripost.teamleadhelper.service.form.CreateEmployeeForm

interface EmployeeService {

    fun create(form: CreateEmployeeForm): EmployeeDTO

    fun update(dto: EmployeeDTO): EmployeeDTO

    fun delete(id: Int): EmployeeDTO

    fun getOne(id: Int): EmployeeDTO

    fun getAll(): List<EmployeeDTO>

}