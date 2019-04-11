public class Runner {

    public static void main(String[] args){
        School berkeley = new School("Berkeley High");


        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher goodrich = new Teacher("Goodrich", "Math");
        Teacher wolkenfeld = new Teacher("Wolkenfeld", "Biology");


        Section math = new Section(goodrich, "Math");
        Section biology = new Section(wolkenfeld, "Biology");
        Section compSci = new Section(albinson, "Computer Science");

        Student alex = new Student("Alex", 12);
        Student kiran = new Student("Kiran", 7);
        Student noe = new Student("Noe", 11);
        Student cameron = new Student("Cameron", 12);
        Student harrison = new Student("Harrison", 9);
        Student henry = new Student("Henry", 12);

        biology.addStudent(kiran);
        biology.addStudent(noe);
        biology.addStudent(harrison);
        biology.addStudent(cameron);

        compSci.addStudent(kiran);
        compSci.addStudent(noe);
        compSci.addStudent(harrison);
        compSci.addStudent(cameron);
        compSci.addStudent(alex);
        compSci.addStudent(henry);

        math.addStudent(alex);
        math.addStudent(noe);
        math.addStudent(kiran);

        System.out.println(biology.toString());
        System.out.println(math.toString());
        System.out.println(compSci.toString());
    }
}
