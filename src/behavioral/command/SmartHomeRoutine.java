package behavioral.command;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class SmartHomeRoutine {

  private List<Command> commands = new ArrayList<>();

  public void addCommands(Command... command) {
    commands.addAll(List.of(command));
  }

  public void removeCommand(Command command) {
    commands.remove(command);
  }

  public void scheduleRoutine(LocalDateTime executionTime) {
    Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      @Override
      public void run() {
        System.out.println("Execution started...");
        executeRoutine();
        timer.cancel();
      }
    }, Date.from(executionTime.atZone(ZoneId.systemDefault()).toInstant()));
  }

  public void executeRoutine() {
    MacroCommand macroCommand = new MacroCommand();
    commands.forEach(macroCommand::addCommand);
    macroCommand.execute();
  }
}
