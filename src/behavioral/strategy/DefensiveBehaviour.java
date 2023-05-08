package behavioral.strategy;

public class DefensiveBehaviour implements Behaviour{

  @Override
  public void perform() {
    System.out.println("Performing defensive behaviour...");
  }
}
