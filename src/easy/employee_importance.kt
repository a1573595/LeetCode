package easy

/**
 * employee-importanc
 * https://leetcode.com/problems/employee-importance/
 */

fun main() {
    val employee = Employee()
    employee.id = 1
    employee.importance = 5
    employee.subordinates = listOf(2, 3)

    val employee2 = Employee()
    employee2.id = 2
    employee2.importance = 3

    val employee3 = Employee()
    employee3.id = 3
    employee3.importance = 3

    val employees: List<Employee> = listOf(employee, employee2, employee3)

    println(getImportance(employees, 1))

    println()
    println()

    val employee4 = Employee()
    employee4.id = 1
    employee4.importance = 2
    employee4.subordinates = listOf(5)

    val employee5 = Employee()
    employee5.id = 5
    employee5.importance = -3

    val employees2: List<Employee> = listOf(employee4, employee5)

    println(getImportance(employees2, 5))

    println()
    println()
}

class Employee {
    var id: Int = 0
    var importance: Int = 0
    var subordinates: List<Int> = listOf()
}

fun getImportance(employees: List<Employee?>, id: Int): Int {
    var number = 0

    employees.find { it?.id == id }?.let {
        number += it.importance
        it.subordinates.forEach {
            number += getImportance(employees, it)
        }
    }

    return number
}