package org.ilin.learn;

//@Component
public class Computer {
    private int id;
    private org.ilin.learn.MusicPlayer musicPlayer;

    public Computer(org.ilin.learn.MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer.playMysic() +
                '}';
    }
}
