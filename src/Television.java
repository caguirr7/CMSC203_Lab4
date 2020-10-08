/**
 * The purpose of this class is to model a television
 * Christian Aguirre 10/08/20
 */

public class Television {

    final private String MANUFACTURER;
    final private int SCREEN_SIZE;
    public boolean powerOn;
    private int channel;
    private int volume;


    /**
     * Constructor
     * @param brand The name brand of the television
     * @param size The size of the television in inches
     */


    public Television(String brand, int size) {

        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        powerOn = false; //Start off the tv as off so it can be turned on with the power method
        volume = 20; //Start the volume at 20 as instructed
        channel = 2; //Start the channel at channel 2 as instructed

    }

    /**
     * The setChannel method sets the channel to play in the television
     * @param station The channel
     */

    public void setChannel(int station){
        channel = station;

    }

    /**
     * The power method sets the TV as on
     */

    public void power(){
        powerOn = !powerOn;

    }

    /**
     * The increaseVolume method increases the volume of the Television
     */

    public void increaseVolume(){
        volume++;
    }

    /**
     * The decreaseVolume method decreases the volume of the Television
     */

    public void decreaseVolume(){
        volume--;
    }

    /**
     * The getChannel method returns the channel
     * @return The channel of the Television
     */

    public int getChannel(){
        return channel;
    }

    /**
     * The getVolume method returns the volume
     * @return The volume of the Television
     */

    public int getVolume(){
        return volume;
    }

    /**
     * The getManufacturer method returns the brand name of the TV
     * @return The name brand of the television
     */

    public String getManufacturer(){
        return MANUFACTURER;
    }

    /**
     * The getScreenSize method returns the screen size of the TV
     * @return The screen size of the television
     */

    public int getScreenSize(){
        return SCREEN_SIZE;
    }


}
