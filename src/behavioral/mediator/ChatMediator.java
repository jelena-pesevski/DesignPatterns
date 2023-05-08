package behavioral.mediator;

/*Base Mediator*/
public interface ChatMediator {

  void sendMessage(String msg, ChatParticipant chatParticipant);
  void addParticipant(ChatParticipant chatParticipant);
  void removeParticipant(ChatParticipant chatParticipant);
}
