package day55.Association2;

import java.util.List;

public class Course {
    String subject;
    //String[] studentsNames; this will work but fixed in size
    List<String> studentNames;

    public Course(String subject,List<String> studentNames){
        this.studentNames=studentNames;
        this.subject=subject;
    }
    public void addStudent(String name){
studentNames.add(name);
    }
    public void addMany(List<String> many){
        studentNames.addAll(many);
    }
    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}
