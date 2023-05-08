package structural.flyweight;

//could make it singleton to avoid being created outside the factory
//or to put it inside the tree factory as a private local class inside the factory

/*Flyweight object, holds intrinsic state*/
public record TreeType(String color, String name, String texture) {

  public void draw(int x, int y){
    System.out.println("Drawing tree:"+name+" of texture and color:"+ texture+", "+ color+" to coordinates: "+x+" "+y);
  }


}
