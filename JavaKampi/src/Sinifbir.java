
public class Sinifbir {

	public static void main(String[] args) {
	
	Course course = new Course(120," Java"," Engin ",3500);
	Course course2 = new Course(180," Python ","Engin ",5000);
	Course course3 = new Course(240," C#"," Engin ",4500);
	
	Course[] Courses = {course,course2,course3};
	
	for(Course courses : Courses) {
		System.out.println(courses.minute + courses.Content + courses.trainer + courses.students);
	}
	
	
	}

}
