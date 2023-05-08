package structural.bridge;

public class BridgeMain {

  public static void main(String[] args) {
    AudioOutputDevice bluetooth = new BluetoothSpeaker();

    AudioPlayer audioPlayer = new MP3Player(bluetooth);
    audioPlayer.play();

    audioPlayer = new FLACPlayer(bluetooth);
    audioPlayer.play();

    AudioOutputDevice headphones = new Headphones();
    audioPlayer = new FLACPlayer(headphones);
    audioPlayer.play();
  }
}
