package com.example.employee

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.employee.data.models.Employee
import com.example.employee.extensions.toJSON
import com.example.employee.utils.AcademicLevel
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun main() {

    val employee = Employee(
        1,
        "Michelle Itai Cruz Illescas",
        "CAR001",
        AcademicLevel.MASTER,
        LocalDate.parse("1997-10-10"),
        "SEP9999800",
    ).toJSON()

    println(employee)

}