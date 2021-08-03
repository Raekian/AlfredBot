import java.util.Date;

public class AlfredQuotes {
    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return "Hello "+ name + ", good " + dayPeriod;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Hello! Current date is: " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alfred") >= 0){
            return "At your service. As you wish, naturally";
        } else if (conversation.indexOf("Alexis") >= 0){
            return "right away sir, she certainly isn't sophisticated enough for that.";
        }
        return "Right. and with that I shall retire";
    }
}