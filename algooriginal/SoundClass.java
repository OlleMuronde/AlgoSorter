/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algooriginal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author ollemuronde
 */
public class SoundClass extends JPanel {

   private JButton playBtn;
   private Sound sound;

//public SoundClass() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
//     setLayout(new BorderLayout());
//    sound = new Sound("/Users/joebloggs/Desktop/Java/Ensoniq-SQ-2-Electric-Piano-C4.wav");
//    playBtn = new JButton("Play Audio");
//    playBtn.addActionListener(new ActionListener() {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (sound.isOn()) {
//                sound.stop();
//                playBtn.setText("Play Audio");
//            }
//            else {
//                try {
//                    playBtn.setText("Pause Audio");
//                    sound.resume();
//                }
//                catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
//                    e1.printStackTrace();
//                }
//            }
//        }   
//    });
//
//    add(playBtn, BorderLayout.NORTH);
//}

    SoundClass(String link) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
         setLayout(new BorderLayout());
    sound = new Sound(link);
    playBtn = new JButton("Pause Audio");
    playBtn.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (sound.isOn()) {
                sound.stop();
                playBtn.setText("Play Audio");
            }
            else {
                try {
                    playBtn.setText("Pause Audio");
                    sound.resume();
                }
                catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
                    e1.printStackTrace();
                }
            }
        }   
    });

    add(playBtn, BorderLayout.NORTH);
    }
}






//    private JButton playBtn;
//    private Boolean pauseStatus = false;
//    private static int position;
//
//    public SoundClass() throws UnsupportedAudioFileException, IOException {
//        setLayout(new BorderLayout());
//
//        playBtn = new JButton("Play Audio");
//        playBtn.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    
//                    if(pauseStatus==false){
//                    setPauseStatus(false);
//                    resume();}
//                    
//                    if (getPlayStatus() == true) {
//                
//                        playBtn.setText("Play Audio");
//                        setPauseStatus(false);
//                          
//                    } else {
//                  playBtn.setText("Pause Audio");
//                   setPauseStatus(true);
//                 
//                    }
//                    
//                } catch (LineUnavailableException ex) {
//                    Logger.getLogger(SoundClass.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//        });
//
//        add(playBtn, BorderLayout.NORTH);
//    }
//
//    public void pause() throws LineUnavailableException {
//        
//        try {
//            File soundFile = new File("/Users/ollemuronde/Desktop/Java/music_box_happy_birthday_NifterDotCom.wav"); //you could also get the sound file with an URL
//            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioIn);
//            clip.start();
//             position=clip.getFramePosition();
//             clip.stop();
//        } catch (UnsupportedAudioFileException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (LineUnavailableException e) {
//            e.printStackTrace();
//        }
//        
//    }
//    public void play() throws LineUnavailableException {
//        
//        try {
//            File soundFile = new File("/Users/ollemuronde/Desktop/Java/music_box_happy_birthday_NifterDotCom.wav"); //you could also get the sound file with an URL
//            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioIn);
//            clip.start();
//             
//        } catch (UnsupportedAudioFileException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (LineUnavailableException e) {
//            e.printStackTrace();
//        }
//        
//    }
//    public void resume() throws LineUnavailableException {
//        
//        try {
//            File soundFile = new File("/Users/ollemuronde/Desktop/Java/music_box_happy_birthday_NifterDotCom.wav"); //you could also get the sound file with an URL
//            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioIn);
//            clip.start();
//            clip.setFramePosition(position);
//        } catch (UnsupportedAudioFileException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (LineUnavailableException e) {
//            e.printStackTrace();
//        }
//        
//    }
//    
//    
//
//    public void setPauseStatus(boolean b) {
//        this.pauseStatus = b;
//
//    }
//
//    public boolean getPlayStatus() {
//        return this.pauseStatus;
//
//    }
//
//}