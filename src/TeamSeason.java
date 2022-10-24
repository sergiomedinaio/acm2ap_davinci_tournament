import java.util.ArrayList;

public class TeamSeason extends Team {
    private int position;
    private ArrayList<Player> players;

    TeamSeason() {
        this.setPlayers(new ArrayList<Player>());
    }

    TeamSeason(String name) {
        this.setName(name);
        this.setPlayers(new ArrayList<Player>());
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }
    public void addPlayer(Player player){
        this.players.add(player);
        player.setTeam(this);
        return;
    }

    public int getPosition(){
        return this.position;
    }

    public void setPosition(int position){
        this.position = position;
        return;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}