package qaAutomation_TestVagrant;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;

import TestClasses.Player;
import TestClasses.Team;

public class ReadDataFromJson {

	public static String readFileAsString(String file) throws Exception {
		return new String(Files.readAllBytes(Paths.get(file)));
	}

	public static List<Player> rcbPlayers() throws Exception {
		String file = "C:\\Users\\raghu.jain\\Desktop\\gitcode\\TestVagrantTask\\src\\test\\resources\\rcb.json";
		String json = readFileAsString(file);
		Gson gson = new Gson();
		Team rcbteam = gson.fromJson(json, Team.class);
		return rcbteam.player;
	}

}
