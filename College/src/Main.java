public class Main {
    public static void main(String[] args) {
        Student student=new Student();

        String name= student.getName();
        int id=student.getId();

        System.out.println("Name "+student.getName()+" ,"+"Id "+student.getId());

        String str=student.toString();

        System.out.println(student.toString());

        student.setName("Kishor Chaudhary");

        System.out.println("Name "+student.getName()+" ,"+"Id "+student.getId());

        Student sid=new Student("Good Morning",3456);

        String name1= sid.getName();
        int id1=sid.getId();

        System.out.println("Name "+sid.getName()+" ,"+"Id "+sid.getId());

        sid.setName("Good Night");

        System.out.println("Name "+sid.getName()+" ,"+"Id "+sid.getId());

    }
}