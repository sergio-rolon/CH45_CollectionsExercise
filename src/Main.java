public class Main
{
    public static void main( String[] args )
    {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        String courseId2 = "biol_01";
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        
        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        
        courseService.enrollStudent( studentId, courseId2 );
        courseService.displayStudentInformation( studentId);


        
        System.out.println("El total de créditos para el estudiante con matrícula '"+studentId+ "' es: "+ courseService.displayStudentCredits(studentId));
    }


}