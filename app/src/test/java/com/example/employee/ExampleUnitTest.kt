package com.example.employee


import com.example.employee.data.models.Employee
import com.example.employee.utils.AcademicLevel
import org.junit.Test

import org.junit.Assert.*
import java.time.LocalDate

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun getSeniority_isCorrect() {
        val employee = Employee(
            100,
            "Jaime de jesus Pacheco Rebollar",
            "RBJP920101HDFRRR01",
            AcademicLevel.ASSOCIATE,
            LocalDate.parse("2000-09-16"),
            "ABCDEF",
        )
        assertEquals(21, employee.getSeniority())
    }
}