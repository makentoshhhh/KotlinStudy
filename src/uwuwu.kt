///fun main() {
    ///uw()

fun calculate(num1:Int, num2: Int, operand: String){
    when(operand) {
        "+" -> {
            var r = num1+ num2
            print("$num1 + $num2 = ${num1 + num2}")
        }
        "-" -> print("$num1 + $num2 = ${num1 - num2}")
        "*" -> print("$num1 * $num2 = ${num1 * num2}")
        "/" -> print("$num1 / $num2 = ${num1 / num2}")
        else -> print("Введено не коректное число")
    }
}
fun uw(){
    val z:Int = readLine()!!.toInt()
    val y:String = readLine()!!
    val x:Int = readLine()!!.toInt()
   calculate(z,x,y)
}
fun task2(){
    val m:List <Int> = listOf(1,2,3,4,5,6,7,8)
    val p:MutableList <Int> = mutableListOf(1,2,3,4,5)
    p.add(6)
    val o:Map <Int,Int> = mapOf()
    val c:HashMap <Int,Int> = hashMapOf()

}
fun poisk(){
    val a:MutableList <Int> = mutableListOf()



}
fun trichisla(){
    for (i in 100..999){
        var one = i / 100
        var three = i % 10
        var two = i / 10
        two = two % 10
        if (one != two && two != three && three != one){
            println(i)
        }
    }

}
import java.io.File

fun main() {
    println("Введите число студентов:")
    val numStudents = readLine()?.toIntOrNull() ?: 0

    val students = mutableListOf<Student>()
    repeat(numStudents) {
        println("Введите данные студента №${it+1}:")
        val name = readLine() ?: ""
        val age = readLine()?.toIntOrNull() ?: 0
        students.add(Student(name, age))
    }

    File("students.csv").printWriter().use { out ->
        out.println("Name,Age")
        students.forEach { student ->
            out.println("${student.name},${student.age}")
        }
    }

    println("Введите число преподавателей:")
    val numProfessors = readLine()?.toIntOrNull() ?: 0

    val professors = mutableListOf<Professor>()
    repeat(numProfessors) {
        println("Введите данные преподавателя №${it+1}:")
        val name = readLine() ?: ""
        val subject = readLine() ?: ""
        professors.add(Professor(name, subject))
    }

    File("professors.csv").printWriter().use { out ->
        out.println("Name,Subject")
        professors.forEach { professor ->
            out.println("${professor.name},${professor.subject}")
        }
    }

    println("Файлы успешно созданы.")
}

data class Student(val name: String, val age: Int)
data class Professor(val name: String, val subject: String)
