package com.company.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    int[][][] boardPlan;
    Map<Player, Map<Integer, Piece>> playerPieces;

    public Board(List<Player> players){
        setUpBoard();
        int i=0;
        for(Player p : players){

            Map<Integer, Piece> pieces =  new HashMap<>();

            Piece p1 = new Piece(p.getColor(), i, 0);
            pieces.put(0, p1);

            Piece p2 = new Piece(p.getColor(), i, 1);
            pieces.put(1, p2);

            Piece p3 = new Piece(p.getColor(), i, 2);
            pieces.put(2, p3);

            Piece p4 = new Piece(p.getColor(), i, 3);
            pieces.put(3, p4);

            playerPieces.put(p, pieces);
            i++;
        }
    }

    public void setUpBoard(){
        this.boardPlan = new int[4][6][3];

        for(int i=0; i<boardPlan.length; ++i){
            for(int j=1; i<6; ++j){
                boardPlan[i][1][j] = 2;
            }
            boardPlan[i][0][1] = 2;
            boardPlan[i][2][2] = 2;
        }
    }

    public void move(Player p, int pieceId, int move){
        Piece piece = playerPieces.get(p).get(pieceId);
        //Find Piece des
        //Check if board has another piece on dest & check for safe block
        //Check for home
        //Update piece position
    }
}
