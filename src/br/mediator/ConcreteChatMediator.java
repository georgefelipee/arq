package br.mediator;

import br.mediator.ChatMediator;
import br.mediator.User;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChatMediator implements ChatMediator {
    private List<User> users = new ArrayList<>();
    @Override
    public void addUser(User user) {
        users.add(user);
        user.setMediator(this);
    }

    @Override
    public void sendMessage(User sender, String message) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}
