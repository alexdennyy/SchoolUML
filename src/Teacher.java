public class Teacher extends Person {

    public Section[] sections = new Section[8];
    private String subject;
    private int sectionCount;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String sub){
        this.subject = sub;
    }

    public Section[] getSections(){
        return this.sections;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }
}
