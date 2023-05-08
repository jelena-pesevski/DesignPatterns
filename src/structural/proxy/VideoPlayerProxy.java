package structural.proxy;

/*Proxy*/
public class VideoPlayerProxy implements VideoPlayer{

  private boolean isPremiumUser;

  private PremiumVideoPlayer premiumVideoPlayer;

  public VideoPlayerProxy(boolean isPremiumUser) {
    this.isPremiumUser = isPremiumUser;
    if(isPremiumUser){
      premiumVideoPlayer=new PremiumVideoPlayer();
    }
  }

  @Override
  public void play() {
    if(isPremiumUser){
      premiumVideoPlayer.play();
    }else{
      throw new RuntimeException("Not a premium user");
    }
  }

  @Override
  public void stop() {
    if(isPremiumUser){
      premiumVideoPlayer.stop();
    }else{
      throw new RuntimeException("Not a premium user");
    }
  }
}
