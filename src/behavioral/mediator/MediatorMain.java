package behavioral.mediator;

public class MediatorMain {

  public static void main(String[] args) {
    ChatMediator chatMediator = new ChatRoom();

    ChatParticipant user1 = new User("Jelena", chatMediator);
    ChatParticipant user2 = new User("Marko", chatMediator);
    ChatParticipant user3 = new User("Janko", chatMediator);

    user1.send("Hello to everyone");
    user2.send("Hello!");
    user3.send("Hello");

    chatMediator.removeParticipant(user2);

    user1.send("Where is Marko?");
    user3.send("Guess he is gone");

  }
}
