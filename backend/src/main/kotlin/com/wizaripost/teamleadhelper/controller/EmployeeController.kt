package com.wizaripost.teamleadhelper.controller

import com.wizaripost.teamleadhelper.domain.dto.EmployeeDTO
import com.wizaripost.teamleadhelper.service.EmployeeService
import com.wizaripost.teamleadhelper.service.form.CreateEmployeeForm
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("api/employees")
class EmployeeController(val service: EmployeeService) {

    @PutMapping
    fun create(@RequestBody form: CreateEmployeeForm): EmployeeDTO {
        return this.service.create(form)
    }

    @PostMapping("edit/{id}")
    fun update(@RequestBody dto: EmployeeDTO): EmployeeDTO {
        return this.service.update(dto)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable(name = "id") id1: Int): EmployeeDTO {
        return this.service.delete(id1)
    }

    @GetMapping("/list")
    fun getAll(model: Model): Collection<EmployeeDTO> {
        return this.service.getAll()
    }

    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Int): EmployeeDTO {
        return this.service.getOne(id)
    }
}

