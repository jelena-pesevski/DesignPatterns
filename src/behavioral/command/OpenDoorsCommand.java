package behavioral.command;

public class OpenDoorsCommand implements Command{

  @Override
  public void execute() {
    System.out.println("Opening doors...");
  }

  @Override
  public void undo() {
    System.out.println("Closing doors...");
  }
}
