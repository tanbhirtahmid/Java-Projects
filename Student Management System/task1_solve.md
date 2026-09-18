Class Student
{
-id: String
-name: String
-address: String
-hallName: String
}

Class Course
{
-code: String
-title: String
-creditHour: double
-type: String
-prerequisite: boolean
}

Class Registration
{
-student: Student
-courses: List<course>addCourse(Student, Course):void
getCourses(id): List<course>
}

Class ResultSystem
{
-marks: List<double>
-gades: List<double>
-cgpa: double
-registrationData: Registration
enterMarks(Student, Registration):void
courseWiseGrade():void
getMarks(Course):List<double>
getCourseGrades(Course):List<double>
getCGPA(id): double
}

Class StudentManagementSystem
{
-Students: List<Student>
-Courses: List<Course>
-Registration: Registration
-Results: ResultSystem
Add(Student):void
Delete(Student):void
Edit(Student):void
Registration(Student, Course): void
Result(id):void
}