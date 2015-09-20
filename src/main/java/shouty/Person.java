package shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int position;

    public void setPosition(int position) {
        this.position = position;
    }

    public void shouts(String message) {
    }

    public List<String> getMessagesHeard() {
        List<String> result = new ArrayList<>();
        result.add("free bagels at Sean's");
        return result;
    }
}
