package p6;

import java.util.List;

public class Game2 implements Playable{
    private List<Player> players;
    public List<Player> getPlayers(){ return players;}

    public void play() {
        System.out.println("Played");
    }

    public void setPlayers(List<Player> players){
        this.players = players;
    }
}
