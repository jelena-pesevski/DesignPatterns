package behavioral.mediator;

//participants are not communicating directly with each other, it is all done via mediator
public class User implements ChatParticipant {

  private String name;
  private ChatMediator chatMediator;

  public User(String name, ChatMediator chatMediator) {
    this.name = name;
    this.chatMediator = chatMediator;
    chatMediator.addParticipant(this);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void send(String message) {
    System.out.println(name + " sending message:" + message);
    chatMediator.sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println(name + " receiving message:" + message);
  }
}
