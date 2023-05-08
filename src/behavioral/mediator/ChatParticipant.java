package behavioral.mediator;

public interface ChatParticipant {

  String getName();
  void send(String message);
  void receive(String message);

}
