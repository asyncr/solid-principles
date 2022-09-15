package com.example.employee

import com.example.employee.data.models.Employee
import com.example.employee.data.models.Permission
import java.time.LocalDate

fun hasPermission(employee: Employee, date: LocalDate, permissions: List<Permission>): Boolean {
    val permission = permissions.firstOrNull { it.date == date && it.employee == employee }
    return (permission != null)
}

fun getHoraryRandom():MutableMap<String,String>{
    val horary = mutableMapOf<String,String>()
    val listDay = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    var days = listDay.shuffled().take((1..listDay.size).random())
    val duration = (4..8).random()
    val time = (7..(16 - duration)).random()
    listDay.filter { day -> days.contains(day) }.forEach { day ->
        val (defaultHourStart, defaultHourEnd) = "$time:00" to "${time + duration}:00"
        val (randomMinutesA, randomMinutesB) = (0..30).random() to (0..30).random()
        val startHour = "${time + randomMinutesA / 60}:${randomMinutesA % 60}"
        val endHour = "${time + duration + randomMinutesB / 60}:${randomMinutesB % 60}"
        horary[day] = "$startHour-$endHour,$defaultHourStart-$defaultHourEnd"
    }
    return horary
}