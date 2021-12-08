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
public class Main {
    
    public static void main(String[] args) {
        
        Camera cam = new Phone();
        cam.savingPhoto();
        
        Gallary gal = new Phone();
        gal.detaisOfoPic();
        
        Games game = new Phone();
        game.openGames();
        game.playingGames();
        game.endGames();
        
    }
    
}
