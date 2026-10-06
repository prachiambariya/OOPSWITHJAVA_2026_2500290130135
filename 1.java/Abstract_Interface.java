package Abstraction;

abstract class Device{
    String brand = "Samsung";
    abstract void turnOn();
    void showBrand(){
        System.out.println("Brand:" + brand);
    }

}
//Interface 1
interface Camera{
    int MAX_ZOOM = 10;
    void takePhoto();
    default void cameraInfo(){
        System.out.println("Camera is ready");
    }
}
//Interface 2
interface MusicPlayer{
    String TYPE = "Digital";
    void playMusic();
    default void musicInfo(){
        System.out.println("Music player is ready");
    }
    }
class Smartphone extends Device implements Camera, MusicPlayer{
    void turnOn(){
        System.out.println("Smartphone is turned ON");
    }
    public void takePhoto(){
        System.out.println("Taking photo...");
    }
    public void playMusic(){
        System.out.println("Playing music...");
    }
}
public class Abstract_Interface{
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.turnOn();
        s.showBrand();
        s.takePhoto();
        s.playMusic();
        s.cameraInfo();
        s.musicInfo();
        System.out.println("Maximum zoom:"+ Camera.MAX_ZOOM);
    }}