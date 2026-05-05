public class Student {
    private String name;
    private int id;

    public Student (){
        this.name="NONAME";
        this.id=1234;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name "+name+" ,"+"Id "+id;
    }
}
