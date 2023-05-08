package behavioral.command;

public class TurnOnLightCommand implements Command{

  //could contain potential receiver which could handle real logic

  @Override
  public void execute() {
    System.out.println("Turning light on...");
  }

  @Override
  public void undo() {
    System.out.println("Turning light of...");
  }
}
