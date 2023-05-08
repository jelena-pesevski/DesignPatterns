package structural.bridge;

public class MP3Player implements AudioPlayer{

  private final AudioOutputDevice audioOutputDevice;

  public MP3Player(AudioOutputDevice audioOutputDevice) {
    this.audioOutputDevice = audioOutputDevice;
  }

  @Override
  public void play() {
    audioOutputDevice.play();
    System.out.println("Playing MP3...");
  }
}

