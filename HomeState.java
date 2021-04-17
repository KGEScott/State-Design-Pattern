/**
 * When the home state gets called upon, this gives the options of what is available
 * for a response and loads the state selected..
 * @author Kyrtis Scott
 *
 */
public class HomeState implements State {
	
	private TV tv;
	
	public HomeState(TV tv) {
		this.tv = tv;
	}

	/**
	 * Tells the user that the tv is already on the home screen.
	 */
	@Override
	public void pressHomeButton() {
			System.out.println("TV is already on the home screen\n");	
	}

	/**
	 * Tells the user that its loading netflix, then loads the netflix state.
	 */
	@Override
	public void pressNetflixButton() {
		System.out.println("Loading Netflix...");
		tv.setState(tv.getNetflixState());	
	}

	/**
	 * Tells the user that its loading hulu, then loads the hulu state.
	 */
	@Override
	public void pressHuluButton() {
		System.out.println("Loading Hulu...");
		tv.setState(tv.getHuluState());	
	}

	/**
	 * Tells the user that its that you are currently at home and you must 
	 * select an app to show movies.
	 */
	@Override
	public void pressMovieButton() {
		System.out.println("Home: You must pick an app to show movies.");		
	}

	/**
	 * Tells the user that its that you are currently at home and you must 
	 * select an app to view tv shows.
	 */
	@Override
	public void pressTVButton() {
		System.out.println("You must pick an app to show tv shows.");
	}

}
