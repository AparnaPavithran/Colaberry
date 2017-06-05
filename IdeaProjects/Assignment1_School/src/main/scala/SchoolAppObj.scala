import scala.collection.mutable.ArrayBuffer

/**
  * Created by APARNA on 6/1/17.
  */
object SchoolAppObj extends App{

  println("Add School")
  println("School name:")
  val schoolName = scala.io.StdIn.readLine()
  println("School address")
  val address = scala.io.StdIn.readLine()
  val school = new School(schoolName,address)

  var ch='y'
  while(ch.equals('y') || ch.equals('Y')){

      println("1 => Add Student")
      println("2 => Remove Student")
      println("3 => Total Students")
//      println("4 => Add Course")
//      println("5 => Remove Course")

      println("Enter your choice")
      val choice = scala.io.StdIn.readInt()

      choice match {
        case 1 => {

          println("Student name:")
          val studentName = scala.io.StdIn.readLine()
          println("Student id")
          val id = scala.io.StdIn.readInt()
          val student = new Student(studentName,id)
          school enrolStudent(student)
          var cour='y'
          while(cour.equals('y') || cour.equals('Y')){
            println("a: Add course")
            println("b: Remove course")
            val cou=scala.io.StdIn.readChar();
            cou match{
              case 'a' =>{
                println("Course name:")
                val courseName = scala.io.StdIn.readLine()
                println("Course id")
                val id = scala.io.StdIn.readInt()
                val course = new Course(courseName,id)
                student enrolCourse(course)
              }
              case 'b' => {
                println("Course name:")
                val courseName = scala.io.StdIn.readLine()
                println("Course id")
                val id = scala.io.StdIn.readInt()
                val course = new Course(courseName,id)
                student cancelCourse(course)
              }
              case _ => {
                println("Invalid Input")
              }
            }
            println("Do you wanna Add/Remove more courses? y/n")
            cour = scala.io.StdIn.readChar()
          }


        }
        case 2 => {
          println("Student name:")
          val studentName = scala.io.StdIn.readLine()
          println("Student id")
          val id = scala.io.StdIn.readInt()
          val student = new Student(studentName, id)
          school cancelStudent (student)

        }
        case 3 => {
          println("Total Students: "+school.getTotalStudents)
        }
        case _ => {
          println("Invalid Input")
        }
      }//match

      println("Do you wanna continue? y/n")
      ch = scala.io.StdIn.readChar()
    }//while


}//SchoolAppObj

case class School(schoolName:String, address:String){
  var students =new ArrayBuffer[Student]()
  def getTotalStudents = students.length

  def enrolStudent(student:Student) = {
    println("Enrolled "+student.studentName)
    students += student
  }//enrolStudent
  def cancelStudent(student:Student) = {
    println("Cancelled"+student.studentName)
    students -= student
  }//cancelStudent
}//School

case class Student(studentName:String, studentID:Int){
  var courses = new ArrayBuffer[Course]()
  def enrolCourse (course:Course)={
    courses += course
  }//enrollToCourse
  def cancelCourse(course:Course)={
    courses -= course
  }//cancelCourse
}//Student

case class Course(courseName:String, courseID:Int){

}//Course