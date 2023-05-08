package behavioral.strategy;

public class OffensiveBehaviour implements Behaviour{

  @Override
  public void perform() {
    System.out.println("Performing offensive behaviour...");
  }
}
