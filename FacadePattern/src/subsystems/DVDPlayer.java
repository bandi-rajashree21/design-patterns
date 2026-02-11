package subsystems;

public class DVDPlayer {
	public void on() {
		System.out.println("DVD Player on");
	}

	public void play(String movie) {
		System.out.println("Playing movie: " + movie);
	}

	public void off() {
		System.out.println("DVD Player OFF");
	}
}
