import scala.io.StdIn.readLine
import scala.util.Try

object StudentManagement {

  // Function to validate input
  def validateInput(name: String, marksStr: String, totalMarksStr: String): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else {
      val marksOpt = Try(marksStr.toInt).toOption
      val totalMarksOpt = Try(totalMarksStr.toInt).toOption

      (marksOpt, totalMarksOpt) match {
        case (Some(marks), Some(totalMarks)) =>
          if (marks < 0 || totalMarks <= 0 || marks > totalMarks) {
            (false, Some("Marks should be positive and less than or equal to total possible marks"))
          } else {
            (true, None)
          }
        case _ => (false, Some("Marks and total possible marks must be valid integers"))
      }
    }
  }

  // Function to get student info with retries
  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var name = ""
    var marks = 0
    var totalMarks = 0

    while (!isValid) {
      println("Enter student's name:")
      name = readLine()

      println("Enter student's marks:")
      val marksStr = readLine()

      println("Enter total possible marks:")
      val totalMarksStr = readLine()

      val validation = validateInput(name, marksStr, totalMarksStr)

      if (validation._1) {
        isValid = true
        marks = marksStr.toInt
        totalMarks = totalMarksStr.toInt
      } else {
        println(s"Invalid input: ${validation._2.get}")
      }
    }

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (name, marks, totalMarks, percentage, grade)
  }

  
  def printStudentRecord(student: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = student
    println(s"Name: $name")
    println(s"Marks: $marks / $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def main(args: Array[String]): Unit = {
    val studentInfo = getStudentInfoWithRetry()
    printStudentRecord(studentInfo)
  }
}
