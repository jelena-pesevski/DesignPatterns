package structural.decorator;

public class CheeseTopping extends Topping{

  public CheeseTopping(Pizza wrappee) {
    super(wrappee);
  }

  @Override
  public int getPrice() {
    return super.getPrice()+2;
  }
}
