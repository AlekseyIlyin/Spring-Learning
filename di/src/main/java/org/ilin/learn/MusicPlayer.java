package org.ilin.learn;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MusicPlayer implements InitializingBean, DisposableBean {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;

    @PostConstruct
    private void init() {
        System.out.println("do PostConstruct" + this.getClass().getSimpleName());
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("do PreDestroy" + this.getClass().getSimpleName());
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMysic() {
        return music1.getSong() + music2.getSong();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("do afterPropertiesSet " + this.getClass().getSimpleName());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("do destroy " + this.getClass().getSimpleName());
    }
}
