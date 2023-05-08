package behavioral.strategy;

public class StrategyMain {

  public static void main(String[] args) {
    Behaviour offensiveBehaviour = new OffensiveBehaviour();
    Character character = new Character();
    character.setBehaviour(offensiveBehaviour);

    character.behave();

    Behaviour defensiveBehaviour = new DefensiveBehaviour();
    character.setBehaviour(defensiveBehaviour);

    character.behave();
  }
}
