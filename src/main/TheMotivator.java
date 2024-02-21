package main;

public class TheMotivator {

	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
            System.out.println("That's good ");
        else if (score > 50)
            System.out.println("Keep trying");
        else
            System.out.println("Well, it's a start");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}
