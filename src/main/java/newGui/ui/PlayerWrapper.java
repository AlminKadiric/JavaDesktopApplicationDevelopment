package newGui.ui;

import newGui.connection.Player;

public class PlayerWrapper {
    private final Player player;



    public PlayerWrapper(Player player){
        this.player=player;


    }
    public Object getColumnValue(int index){
        switch (index){
            case 0: return player.getId();
            case 1:return player.getName();
            case 2:return player.getSurname();
            case 3: return  player.getSport();
            case 4:return player.getOfYears();
            case 5: return player.getVegetarian();
            case 6:return player.getColor();


        }
        return null;
    }

    public void setColumnValue(int index,Object aValue){
        switch (index){
            case 0: player.setId((Long) aValue);break;
            case 1:player.setName((String) aValue);break;
            case 2:player.setSurname((String) aValue);break;
            case 3: player.setSport((String) aValue);break;
            case 4:player.setOfYears((Integer) aValue);break;
            case 5: player.setVegetarian((Boolean) aValue);break;
            case 6:player.setColor((String) aValue);break;


        }

    }



}
