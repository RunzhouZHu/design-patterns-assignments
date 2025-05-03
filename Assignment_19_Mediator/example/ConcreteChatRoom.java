package example;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChatRoom implements ChatRoom {
    @Override
    public void sendMessage(Message message) {
        for (User u : users) {
            if(u.equals(message.getReceiver())) {
                u.receive(message);
            }
        }
    }

    private List<User> users =  new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }
}
