package shouty;

import java.util.List;

public class Person {
    private int position;
    private List<String> messagesHeard;

    public void setPosition(int position) {
        this.position = position;
    }

    public void shouts(String message) {
    }

    public List<String> getMessagesHeard() {
        return messagesHeard;
    }
}
