package structural.decorator;

public class DecoratorMain{

  public static void main(String[] args){
    //should return 5
    Pizza pizza=new CheesePizza();
    System.out.println("Price of single cheese pizza:"+ pizza.getPrice());

    pizza=new CheeseTopping(pizza);
    System.out.println("Price of cheese pizza with cheese topping:"+ pizza.getPrice());

    pizza=new VeggieTopping(pizza);
    System.out.println("Price of cheese pizza with cheese and veggie topping:"+ pizza.getPrice());

  }
}
