/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author ollemuronde
 */
    public class Sound {
   
    private Clip clip;
    private boolean on;
    private String src;
    private int pauseValue=0;

    public Sound(String filename) throws LineUnavailableException, IOException, UnsupportedAudioFileException{
      //  src = getClass().getResource(filename);
        src=filename;
      //  System.out.println(src);
        
        resume();
    }

    public void resume() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
//        clip = AudioSystem.getClip();
//        clip.open(AudioSystem.getAudioInputStream(src));
        File soundFile = new File(src); //you could also get the sound file with an URL
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
             clip = AudioSystem.getClip();
             clip.open(audioIn);
       clip.setFramePosition(pauseValue);
            clip.start();
           
     //   clip.loop(Clip.LOOP_CONTINUOUSLY); //loop the clip whenever finished so never stops playing
        on = true;
    }

    public void stop() {
        if (clip.isRunning()) {
           pauseValue=clip.getFramePosition();
            clip.stop();
            
        }
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}



