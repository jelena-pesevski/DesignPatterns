package structural.decorator;

/*Base decorator class*/
public class Topping implements Pizza{

  private Pizza wrappee;
  
  public Topping(Pizza wrappee){
    this.wrappee=wrappee;
  }

  @Override
  public int getPrice() {
    return wrappee.getPrice();
  }
}
