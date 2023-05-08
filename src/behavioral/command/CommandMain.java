package behavioral.command;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CommandMain {

  public static void main(String[] args) {
    Command firstCommand = new TurnOnLightCommand();
    Command secondCommand = new OpenDoorsCommand();
    Command thirdCommand = new TurnOffLightsCommand();

    SmartHomeRoutine smartHomeRoutine = new SmartHomeRoutine();
    smartHomeRoutine.addCommands(firstCommand, secondCommand, thirdCommand);

    smartHomeRoutine.scheduleRoutine(LocalDateTime.now().plus(10, ChronoUnit.SECONDS));
  }
}
