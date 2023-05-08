package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {

  private List<Command> commandList = new ArrayList<>();

  public void addCommand(Command command) {
    commandList.add(command);
  }

  public void removeCommand(Command command) {
    commandList.remove(command);
  }

  @Override
  public void execute() {
    commandList.forEach(Command::execute);
  }

  @Override
  public void undo() {
    //need to be undone from the end
    for (int i = commandList.size() - 1; i >= 0; i--) {
      commandList.get(i).undo();
    }
  }
}
