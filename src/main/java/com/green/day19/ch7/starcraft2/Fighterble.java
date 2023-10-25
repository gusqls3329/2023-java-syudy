package com.green.day19.ch7.starcraft2;

import com.green.day19.ch7.PlayingCard;

public interface Fighterble extends Movable, Attackable { }


interface Movable{ void move(int x, int y);} //void move(int x, int y); : 추상메소드 생략된것

interface Attackable{void attack(Unit u);}
class Unit{
    private int currentHp;
    private int x;
    private int y;
}
class Fighter extends Unit implements Fighterble{ //p.385

    @Override
    public void move(int x, int y) {}

    @Override
    public void attack(Unit u) {}
}

class FighterTest{
    public static void main(String[] args) {
        Movable movable = new Fighter(); //Movable이 부모이기 때문에
        movable.move(10,20);
        Fighter fighter = (Fighter) movable; // fighter이 자식이기 때문에
        fighter.attack(null);

        Attackable attackable = (Attackable)movable;
        attackable.attack(null);
    }
}