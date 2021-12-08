/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Polymorphism;

/**
 *
 * @author User
 */
public class Phone implements Camera,Gallary,Wifi,Games{

    @Override
    public void opencam() {
        System.out.println("Camera is opening.....");
    }

    @Override
    public void takingphoto() {
       System.out.println("Camera is taking photo.....");
    }

    @Override
    public void savingPhoto() {
        System.out.println("Gallary is opening .....");
 
    }

    @Override
    public void selectPic() {
        System.out.println("Pic is selecting.....");
        
    }

    @Override
    public void viewPic() {
        System.out.println("View the pic.....");
        
    }

    @Override
    public void detaisOfoPic() {
        System.out.println("Showing Details of pic.....");
       
    }

    @Override
    public void searchWifi() {
        System.out.println("Wifi is searching.....");
        
    }

    @Override
    public void selectWifi() {
        System.out.println("Wifi is selecting.....");
        
    }

    @Override
    public void connectWifi() {
        System.out.println("Wifi is connecting.....");
        
    }

    @Override
    public void openGames() {
        System.out.println("Game is opening.....");
        
    }

    @Override
    public void playingGames() {
        System.out.println("Game is plaing.....");
        
    }

    @Override
    public void endGames() {
        System.out.println("Game is ending.....");
        
    }
    
}
