public class Section {

    private Teacher teacher;
    private Student[] students = new Student[100];
    private String name;
    private int currentSize;

    public Section(Teacher teacher, String name){
        this.teacher = teacher;
        this.name = name;
        this.currentSize = 0;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void addStudent(Student s){
        students[currentSize] = s;
        currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        String studInSect = " ";
        for(int i = 0; i < currentSize; i++){
            studInSect += students[i].getName() + " ";
        }

        return this.name + " class has a size of " + this.currentSize + " and is taught by " + this.teacher.getName() + " with students: " + studInSect;
    }
}
