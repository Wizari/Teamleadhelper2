package com.wizaripost.teamleadhelper.service

import com.wizaripost.teamleadhelper.domain.dto.EmployeeDTO
import com.wizaripost.teamleadhelper.domain.entity.Employee
import com.wizaripost.teamleadhelper.domain.repository.EmployeeRepository
import com.wizaripost.teamleadhelper.service.form.CreateEmployeeForm
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl(val repository: EmployeeRepository) : EmployeeService {
    override fun create(form: CreateEmployeeForm): EmployeeDTO {
        return convert(this.repository.save(Employee(form.firstName, form.lastName)))
    }

    override fun update(dto: EmployeeDTO): EmployeeDTO {
//        TODO()
//        var employee = this.repository.findById(dto.id) ?: throw BadParamsException()
        var employee = this.repository.getOne(dto.id!!)
        employee.firstName = dto.firstName
        employee.lastName = dto.lastName
        this.repository.save(employee)
        return convert(employee)
    }

    override fun delete(id: Int): EmployeeDTO {
        var employee = this.repository.getOne(id)
        this.repository.deleteById(id)
        return convert(employee)
    }

    override fun getOne(id: Int): EmployeeDTO {
        return convert(this.repository.getOne(id))
    }

    override fun getAll(): List<EmployeeDTO> {
        return this.repository.findAll().map { employee -> convert(employee) }
    }


    fun convert(employee: Employee): EmployeeDTO {
        var dto = EmployeeDTO(employee.firstName, employee.lastName)
        dto.id = employee.id
        return dto
    }

}