public class Question {
    String tv;

    public Question(String newTV) {
        this.tv = newTV;

    }

    public boolean getSamsung(){
        if (tv.charAt(0) == 'S') {
        return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String istv = "This model is a " + this.tv;
        return istv;
    }
}
