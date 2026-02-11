package client;

import facade.HomeTheatreFacade;
import subsystems.Amplifier;
import subsystems.DVDPlayer;
import subsystems.Projector;
public class FacadePatternDemo {
	public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Amplifier amp = new Amplifier();

        HomeTheatreFacade homeTheater = new HomeTheatreFacade(dvd, projector, amp);

        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
  
}
