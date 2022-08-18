package TestSuite;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestClasses.Player;
import qaAutomation_TestVagrant.ReadDataFromJson;

public class TestCases extends ReadDataFromJson {

	List<Player> players;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		 players=super.rcbPlayers();
	}
	
	@Test
	public void fourForeignPlayers() throws Exception {
		int count = 0;
		int Expected = 4;
		for (int i = 0; i <players.size(); i++) {
			Player p= players.get(i);
			if (!p.country.equals("India"))

			{
				count++;

			}

		}
		int Actual = count;
		Assert.assertEquals(Expected, Actual);

	}

	@Test
	public void atleastOneWicketKeeper() throws Exception {
		int wk = 0;
		int Expected = 1;
		for (int i = 0; i <players.size(); i++) {
			Player p= players.get(i);
			if (p.role.equals("Wicket-keeper"))

			{
				wk++;

			}

		}
		int Actual = wk;
		Assert.assertEquals(Expected, Actual);

	}
}
