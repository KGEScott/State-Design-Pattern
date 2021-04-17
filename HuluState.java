/**
 * When the hulu state gets called upon, this gives the options of what is available
 * for a response and loads the state selected..
 * @author Kyrtis Scott
 *
 */
public class HuluState implements State{
	
	private TV tv;
	
	public HuluState(TV tv) {
		this.tv = tv;
	}

	/**
	 * Tells the user that the home screen is being loaded, then changes the state to home state.
	 */
	@Override
	public void pressHomeButton() {
		System.out.println("\nLoading the Home Screen...\n");
		tv.setState(tv.getHomeState());	
	}

	/**
	 * Tells the user that netflix is loading, then loads the netflix state.
	 */
	@Override
	public void pressNetflixButton() {
		System.out.println("\nLoading Netflix...\n");
		tv.setState(tv.getNetflixState());
	}

	/**
	 * Tells the user that hulu is already selected.
	 */
	@Override
	public void pressHuluButton() {
		System.out.println("We are already in Hulu.");
		
	}

	/**
	 * Tells the user what movies are currently available for hulu.
	 */
	@Override
	public void pressMovieButton() {
		System.out.println("\n Hulu Movies:");
		System.out.println("-The Social Network" + "\n-Star Trek II: The Wrath of Khan" + "\n-Palm Springs"
	+ "\n-The Nice Guys" + "\n-Deadpool");
		
	}

	/**
	 * Tells the user what shows are currently available for hulu.
	 */
	@Override
	public void pressTVButton() {
		System.out.println("\nHulu TV Shows:");
		System.out.println("-Tyrant" + "\n-Into the Dark" + "\n-American Horror Story"
	+ "\n-Brooklyn 99" + "\n-DEVS");
		
	}

}
