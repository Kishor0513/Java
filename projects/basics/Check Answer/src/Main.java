public class Main {
    public static void main(String[] args) {
        Meeting meeting=new Meeting();
        meeting.setTime("12:50 PM");
        meeting.setLocation("room 1234");
        meeting.setSubject("Management's meeting");
        System.out.println(meeting.printDetails());
    }
}

