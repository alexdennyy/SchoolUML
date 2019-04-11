public class Student extends Person{

    public Section[] sections = new Section[8];
    int Grade;
    int sectionCount = 0;

    public Student(String name, int Grade){
       super(name);
       this.Grade = Grade;
    }

    public int getGrade(){
        return this.Grade;
    }

    public void setGrade(int n){
        this.Grade = n;
    }

    public Section[] getSections(){
        return this.sections;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }
}
