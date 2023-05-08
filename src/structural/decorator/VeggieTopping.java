package structural.decorator;

public class VeggieTopping extends Topping{

  public VeggieTopping(Pizza wrappee) {
    super(wrappee);
  }

  @Override
  public int getPrice() {
    return super.getPrice()+3;
  }
}
