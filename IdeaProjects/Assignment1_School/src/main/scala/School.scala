///**
//  * Created by APARNA on 5/30/17.
//  */
//
//
//import scala.collection.mutable.ArrayBuffer
//
//object SchoolObj extends App {
//
//
//  println("Add School")
//  println("School name:")
//  val schoolName = scala.io.StdIn.readLine()
//  println("School address")
//  val address = scala.io.StdIn.readLine()
//  val school = new School(schoolName,address)
//
//  var ch='y'
//  while(ch!='n' || ch!='N'){
//
//    println("1 => Add Student")
//    println("2 => Remove Student")
//    println("3 => Total Students")
//    println("4 => Add Course")
//    println("5 => Remove Course")
//
//    println("Enter your choice")
//    val choice = scala.io.StdIn.readInt()
//
//    choice match {
//      case 1 => {
//
//        println("Student name:")
//        val studentName = scala.io.StdIn.readLine()
//        println("Student id")
//        val id = scala.io.StdIn.readInt()
//        val student = new Student(studentName,id)
//        school enrolStudent(student)
//      }
//      case 2 => {
//        println("Student name:")
//        val studentName = scala.io.StdIn.readLine()
//        println("Student id")
//        val id = scala.io.StdIn.readInt()
//        val student = new Student(studentName,id)
//        school cancelStudent(student)
//
//        println("6 => Enrol Course")
//        println("7 => Cancel Course")
//
//        println("Enter your choice")
//        val studChoice = scala.io.StdIn.readInt()
//
//        studChoice match {
//          case 6 => {
//            school courses
////            println("Enter course to add")
////            val c=scala.io.StdIn.readLine()
//
//          }
//          case 7 => {
//
//          }
//        }
//      }
//      case 3 => {
//        println("Total Students: "+school.getTotalStudents)
//      }
//      case 4 => {
//        println("Course name:")
//        val courseName = scala.io.StdIn.readLine()
//        println("Course id")
//        val id = scala.io.StdIn.readInt()
//        val course = new Course(courseName,id)
//        school addCourse(course)
//      }
//      case 5 => {
//        println("Course name:")
//        val courseName = scala.io.StdIn.readLine()
//        println("Course id")
//        val id = scala.io.StdIn.readInt()
//        val course = new Course(courseName,id)
//        school removeCourse(course)
//      }
//    }//match
//
//    println("Do you wanna continue? y/n")
//
//
//    ch = scala.io.StdIn.readChar()
//  }//while
//
//  val student = new Student("A",1)
//  val course = new Course("Scala",1)
//
////  println("School name and Address")
////  val input = scala.io.StdIn.readLine()
//
//  school addCourse(course)
//  school enrolStudent(student)
//  println(school getCourses)
//  println(school getTotalStudents)
//
//
//}//SchoolObj
//case class School(schoolName:String, address:String) {
////  val courses : Array[Int] = Array()//arrays
////  val students : Array[Int] = Array() //arrays
//
////  var courses  = new ArrayBuffer[String]
////  var students = new ArrayBuffer[String]
//  var courses  = new ArrayBuffer[Course]
//  var students = new ArrayBuffer[Student]
//
//  def getTotalStudents = students.length
//  def getStudents = students
//  def getCourses = courses
//
//  def enrolStudent(student:Student) = {
////    val i=getTotalStudents+1
////    students(i)=studentName
//    println("Enrolled "+student.studentName)
//    students += student
//  }//enrolStudent
//
//  def cancelStudent(student:Student) = {
//    println("Cancelled"+student.studentName)
//    students -= student
//  }//cancelStudent
//
////  def getCourse(courseName:String): Unit ={
////
////  }//getCourse
//
//  def addCourse(course:Course) = {
//    courses += course
//  }//addCourse
//
//  def removeCourse (course:Course)= {
//    courses -= course
//  }//removeCourse
//
//}//School
//
//case class Student(studentName:String,studentId:Int){
//
//  var courses  = new ArrayBuffer[Course]
//
//
//  def enrolCourse (course:Course)={
//    courses += course
//  }//enrollToCourse
//  def cancelCourse(course:Course)={
//    courses -= course
//  }//cancelCourse
//
//}//Student
//
//case class Course(courseName:String,courseId:Int){
//
//  def getCourse(thisName:String): Unit ={
//    if(thisName==courseName)
//      courseId
//  }
//}//Course
