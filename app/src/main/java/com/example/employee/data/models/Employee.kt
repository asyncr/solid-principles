package com.example.employee.data.models

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.employee.utils.AcademicLevel
import java.time.LocalDate

data class Employee(
    val id: Long,
    val fullName: String,
    val curp: String,
    val academicLevel: AcademicLevel,
    val dateOfAdmission: LocalDate,
    val budgetKey: String
) {
    @RequiresApi(Build.VERSION_CODES.O)
    fun getSeniority(): Int {
        val currentYear = LocalDate.now().year
        val currentMonth = LocalDate.now().monthValue
        val currentDay = LocalDate.now().dayOfMonth
        val yearOfAdmission = dateOfAdmission.year
        val monthOfAdmission = dateOfAdmission.monthValue
        val dayOfAdmission = dateOfAdmission.dayOfMonth
        val year = currentYear - yearOfAdmission
        return (if (currentMonth < monthOfAdmission ||
            (currentMonth == monthOfAdmission && currentDay < dayOfAdmission)
        ) year - 1 else year)
    }

    fun getGenre() = curp.substring(10, 11)

}