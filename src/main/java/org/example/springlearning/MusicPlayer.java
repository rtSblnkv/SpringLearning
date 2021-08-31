package org.example.springlearning;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public void playMusic(){
        System.out.println(" Playing " + music.getSong());
    }
}
