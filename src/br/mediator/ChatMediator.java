package br.mediator;

public interface ChatMediator {
    void sendMessage(User sender, String message);
    void addUser(User user);
}
