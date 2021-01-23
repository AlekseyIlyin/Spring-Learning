package org.ilin.learn;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.ilin.learn")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Lazy
    public org.ilin.learn.ClassicalMusic classicalMusic() {
        return new org.ilin.learn.ClassicalMusic();
    }

    @Bean
    @Lazy
    public org.ilin.learn.RockMusic rockMusic() {
        return new org.ilin.learn.RockMusic();
    }

    @Bean
    @Lazy
    public org.ilin.learn.PopMusic popMusic() {
        return new org.ilin.learn.PopMusic();
    }

    @Bean
    public org.ilin.learn.MusicPlayer musicPlayer() {
        return new org.ilin.learn.MusicPlayer(rockMusic(),classicalMusic());
    }

    @Bean
    @Lazy
    public org.ilin.learn.Computer computer(){
        return new org.ilin.learn.Computer(musicPlayer());
    }
}
