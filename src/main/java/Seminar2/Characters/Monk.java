package Seminar2.Characters;

import Seminar2.Coordinate;

import java.util.ArrayList;

public class Monk extends BaseUnit{

    public Monk(ArrayList<BaseUnit> gangSide, int x, int y){
        super("Monk", 17, 12, new int[]{-5, -5}, 30, 9, true, false);
        super.position = new Coordinate(x, y);
        super.gangSide = gangSide;
    }
}