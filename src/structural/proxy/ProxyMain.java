package structural.proxy;

public class ProxyMain {

  public static void main(String[] args) {
    VideoPlayer player = new VideoPlayerProxy(true);
    player.play();
    player.stop();

    player = new VideoPlayerProxy(false);
    player.play();
  }
}
