
package media;


public class Television {
    
    private int volume;
    private int currentProgram;
    private boolean turnOn;

    public Television() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public boolean getTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    
   public Television(int volume, int currentProgram, boolean turnOn) {
       this.volume = volume;
       this.currentProgram = currentProgram;
       this.turnOn = turnOn;
   }
   
   
   public void showData() {
       System.out.println("Volume is: " + getVolume());
       System.out.println("Current program: " + getCurrentProgram());
       System.out.println("TurnOn: " + getTurnOn());
       System.out.println("");
   }
   
   public void setAllAtOnce(boolean turnOn, int currP) {
       setTurnOn(turnOn);
       setCurrentProgram(currP);
   }
    
}
