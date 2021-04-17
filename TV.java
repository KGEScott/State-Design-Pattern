/**
 * Creates new instances, presses the button to change states. Sets the state, returns the state.
 * @author Kyrtis Scott
 *
 */
public class TV {
	
	private State HomeState;
	private State NetflixState;
	private State HuluState;
	private State state;
	
	/**
	 * Creates new instances.
	 */
	public TV() {
		HomeState = new HomeState(this);
		NetflixState = new NetflixState(this);
		HuluState = new HuluState(this);
		state = HomeState;
	}
/**
 * Calls the HomeButton method within the state that is currently selected.
 */
	public void pressHomeButton() {
		state.pressHomeButton();
	}
	
	/**
	 * Calls the NetflixButton method within the state that is currently selected.
	 */
	public void pressNetflixButton() {
		state.pressNetflixButton();
	}
	
	/**
	 * Calls the HuluButton method within the state that is currently selected.
	 */
	public void pressHuluButton() {
		state.pressHuluButton();
	}
	
	/**
	 * Calls the MovieButton method within the state that is currently selected.
	 */
	public void pressMovieButton() {
		state.pressMovieButton();
	}
	
	/**
	 * Calls the TVButton method within the state that is currently selected.
	 */
	public void pressTVButton() {
		state.pressTVButton();
	}
	
	/**
	 * Sets the current state to the one selected in the driver.
	 * @param state passes state through to be set.
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * Returns the home state.
	 * @return home state
	 */
	public State getHomeState() {
		return HomeState;
	}
	
	/**
	 * Returns the netflix state.
	 * @return netflix state
	 */
	public State getNetflixState() {
		return NetflixState;
	}
	
	/**
	 * Returns the hulu state.
	 * @return hulu state
	 */
	public State getHuluState() {
		return HuluState;	
	}

}
