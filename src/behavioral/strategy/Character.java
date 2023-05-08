package behavioral.strategy;

public class Character {

  private Behaviour behaviour;

  public void setBehaviour(Behaviour behaviour) {
    this.behaviour = behaviour;
  }

  public void behave(){
    behaviour.perform();
  }
}
