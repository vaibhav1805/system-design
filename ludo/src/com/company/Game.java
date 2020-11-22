package com.company;

import com.company.models.Board;
import com.company.models.Player;

import java.util.LinkedList;
import java.util.Map;
import java.util.UUID;

public class Game {
    private String gameId;
    private Board gameBoard;
    private Map<Player, Integer> score;
    private LinkedList<Player> pQueue;
    private int numPlayers;


    public  Game(int numPlayers){
        this.gameId = UUID.randomUUID().toString();
        this.numPlayers = numPlayers;
    }

    void startGame(){
        this.gameBoard = new Board(this.pQueue);
    }

    void endGame(){}

    void update(int move, Player player, int pieceId){
        this.gameBoard.move(player, pieceId, move);
    }

    void addPlayer(String username, String color){
        Player p = new Player(UUID.randomUUID().toString(), username, color);
        this.pQueue.add(p);
    }
}
