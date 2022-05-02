
public class MonsterManager {
	private Player newPlayer = new Player();
	private Battles battle = new Battles();
	private Shop newShop = new Shop();
//	private Inventory bag = newPlayer.getInventory();
	
	public void launchHomeScreen() {
		HomeScreen mainWindow = new HomeScreen(this);
	}
	
	public void closeHomeScreen(HomeScreen homeWindow) {
		homeWindow.closeWindow();
	}
	
	public void launchChooseMonsterScreen() {
		ChooseMonsterScreen chooseWindow = new ChooseMonsterScreen(this);
	}
	
	public void closeChooseMonsterScreen(ChooseMonsterScreen chooseWindow) {
		chooseWindow.closeWindow();
	}
	
	public void launchBattleScreen() {
		BattleScreen battleWindow = new BattleScreen(this);
	}
	
	public void closeBattleScreen(BattleScreen battleWindow) {
		battleWindow.closeWindow();
	}
	
	public void launchTeamScreen() {
		TeamScreen teamWindow = new TeamScreen(this);
	}
	
	public void closeTeamScreen(TeamScreen teamWindow) {
		teamWindow.closeWindow();
	}
	
	public Player getPlayer() {
		return newPlayer;
	}
	
//	public void launchSetupScreen() {
//		SetupScreen mainWindow = new SetupScreen(this);
//	}
//	
//	public void closeSetupScreen(MainScreen mainWindow) {
//		mainWindow.closeWindow();
//	}
	
	public static void main(String[] args) {
		MonsterManager manager = new MonsterManager();
		manager.launchHomeScreen();
	}
}