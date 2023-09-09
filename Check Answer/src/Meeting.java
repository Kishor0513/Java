import static java.util.Calendar.PM;
public class Meeting {
    private String time;
    private String location;
    private String subject;

    public Meeting() {
        this.time = "";
        this.location = "";
        this.subject = "";
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String printDetails(){
        return "Meeting in "+getLocation()+" at "+getTime()+";"+" Subject: "+getSubject();
    }
}
