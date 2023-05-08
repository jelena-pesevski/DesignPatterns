package behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

/*Mediator implementation*/
public class ChatRoom implements ChatMediator {

  //has references to other components
  private final Map<String, ChatParticipant> participants = new HashMap<>();

  @Override
  public void sendMessage(String msg, ChatParticipant chatParticipant) {
    participants.values().stream()
        .filter(participant -> !participant.getName().equals(chatParticipant.getName()))
        .forEach(participant -> participant.receive(msg));
  }

  @Override
  public void addParticipant(ChatParticipant chatParticipant) {
    if (!participants.containsKey(chatParticipant.getName())) {
      participants.put(chatParticipant.getName(), chatParticipant);
    }
  }

  @Override
  public void removeParticipant(ChatParticipant chatParticipant) {
    participants.remove(chatParticipant.getName());
  }
}
