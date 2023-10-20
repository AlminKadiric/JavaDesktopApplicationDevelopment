package newGui.connection;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        PlayerDao playerDao = new PlayerDao();
        List<Player> playerList =playerDao.getAll();
        List<String> columnNames = playerDao.getColumnNames();
        columnNames.stream().map(it->it + " ").forEach(s-> System.out.println(s));
    }


}
