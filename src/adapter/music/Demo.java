package adapter.music;

public class Demo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "nothing_else_matters.mp3");
        audioPlayer.play("vlc", "blade.vlc");
        audioPlayer.play("mp4", "iphone-presentation.mp4");
        audioPlayer.play("avi", "american-pie-1.avi");
    }
}
