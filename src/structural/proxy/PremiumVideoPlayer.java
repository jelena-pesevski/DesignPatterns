package structural.proxy;

/*Protected service*/
public class PremiumVideoPlayer implements VideoPlayer{

  @Override
  public void play() {
    System.out.println("Playing premium content...");
  }

  @Override
  public void stop() {
    System.out.println("Stopping premium content...");
  }
}
