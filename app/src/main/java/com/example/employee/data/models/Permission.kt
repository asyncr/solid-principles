package com.example.employee.data.models

import java.time.LocalDate

data class Permission(
    val employee: Employee,
    val date: LocalDate,
    val justification: String,
)