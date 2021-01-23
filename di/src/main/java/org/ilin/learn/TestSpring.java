package org.ilin.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        context.registerShutdownHook();
        context.refresh();


//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMysic();
//
//        Music music1 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music1);
//        classicalMusicPlayer.playMysic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMysic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer.toString());

        org.ilin.learn.MusicPlayer player = context.getBean("musicPlayer", org.ilin.learn.MusicPlayer.class);
        System.out.println(player.getName());
        System.out.println(player.getVolume());

        org.ilin.learn.ClassicalMusic classicalMusic = context.getBean("classicalMusic", org.ilin.learn.ClassicalMusic.class);

        //context.close();

    }
}
