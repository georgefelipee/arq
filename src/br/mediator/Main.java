package br.mediator;

public class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ConcreteChatMediator();

        User alice = new ConcreteUser("Alice");
        User bob = new ConcreteUser("Bob");
        User charlie = new ConcreteUser("Charlie");

        mediator.addUser(alice);
        mediator.addUser(bob);
        mediator.addUser(charlie);

        alice.sendMessage("Hello, everyone!");
        bob.sendMessage("Hi Alice!");
        charlie.sendMessage("Hey Alice and Bob!");
    }

}