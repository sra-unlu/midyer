import greenfoot.GreenfootSound;
import greenfoot.Greenfoot;

public class MusicManager {
    private static GreenfootSound backgroundMusic = new GreenfootSound("ambience.mp3");

    // Start playing the music
    public static void startMusic() {
        if (!backgroundMusic.isPlaying()) {
            backgroundMusic.playLoop();
        }
    }

    // Stop or pause the music
    public static void stopMusic() {
        if (backgroundMusic.isPlaying()) {
            backgroundMusic.pause();
        }
    }
}