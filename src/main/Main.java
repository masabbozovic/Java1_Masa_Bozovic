package main;

import media.Radio;
import media.Television;


public class Main {

    public static void main(String[] args) {
     
        
    Television tv = new Television(6, 45, true);
    tv.showData();
    
    tv.setVolume(9);
    tv.setCurrentProgram(67);
    tv.setTurnOn(false);
    tv.showData();
    
    tv.setAllAtOnce(true, 99);
    tv.showData();
    

    
    Radio Rock = new Radio(99.6, 104, 'F');
    Rock.showData();

    Rock.setFmFrequency(99.7);
    Rock.setAmFrequency(202);
    Rock.setBand('A');
    Rock.showData();
    
    
    }

}
