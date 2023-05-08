package behavioral.command;

public class TurnOffLightsCommand implements Command{

  @Override
  public void execute() {
    System.out.println("Turning lights off...");
  }

  @Override
  public void undo() {
    System.out.println("Turning lights on...");
  }
}
