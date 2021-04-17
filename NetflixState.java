/**
 * When the netflix state gets called upon, this gives the options of what is available
 * for a response and loads the state selected..
 * @author Kyrtis Scott
 *
 */
public class NetflixState implements State{

	private TV tv;
	
	public NetflixState(TV tv) {
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
	 * Tells the user that Netflix is already selected.
	 */
	@Override
	public void pressNetflixButton() {
		System.out.println("\nWe are already in Netflix.\n");		
	}

	/**
	 * Tells the user that hulu is loading, then loads the hulu state.
	 */
	@Override
	public void pressHuluButton() {
		System.out.println("\nLoading Hulu...\n");
		tv.setState(tv.getHuluState());
	}

	/**
	 * Tells the user what movies are currently available for netflix.
	 */
	@Override
	public void pressMovieButton() {
		System.out.println("\nNetflix Movies:");
		System.out.println("-What Lies Below" + "\n-Concrete Cowboy" + "\n-Saving Private Ryan"
	+ "\n-Legally Blonde" + "\n-Sniper: Ghost Shooter");	
	}

	
	/**
	 * Tells the user what shows are currently available for netflix.
	 */
	@Override
	public void pressTVButton() {
		System.out.println("\nNetflix TV Shows:");
		System.out.println("-The Witcher" + "\n-Money Heist" + "\n-Stranger Things"
	+ "\n-Tiger King" + "\n-Bridgerton");
	}

}
