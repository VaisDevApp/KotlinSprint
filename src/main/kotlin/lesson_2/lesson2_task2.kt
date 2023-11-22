package lesson_2

fun main() {
    val countWorkers = 50
    val countStudets = 30
    val countAll = countStudets +countWorkers
    val salaryWorkers = 30000
    val salaryStudents = 20000
    val expensesForWorkers = countWorkers*salaryWorkers
    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesForWorkers")
    val expensesForAllWorkers = expensesForWorkers+countStudets*salaryStudents
    println("Общие расходы по ЗП после прихода стажеров: $expensesForAllWorkers")
    val averageSalary = expensesForAllWorkers/countAll
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")
}
