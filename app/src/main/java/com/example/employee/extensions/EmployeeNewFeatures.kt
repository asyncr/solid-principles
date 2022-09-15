package com.example.employee.extensions

import com.example.employee.data.models.Employee

fun Employee.toJSON(): String {
    return "Implement second principle of SOLID for Employee class\n" +
            "{\"id\": ${this.id}, \"name\": \"${this.fullName}\"" +
            ", \"curp\": \"${this.curp}\", \"academicLevel\": \"${this.academicLevel}\"" +
            ", \"dateOfAdmission\": ${this.dateOfAdmission}, \"budgetKey\": \"${this.budgetKey}\"}"
}