package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Bedroom {
    String name;
    Wall wall1;
    Wall wall2;
    Wall wall3;
    Wall wall4;
    Ceiling ceiling;
    Bed bed;
    Lamp lamp;
    Wardrobe wardrobe;
    Carpet carpet;
    private Bedroom bedroom;


    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }
    public static void main(String[] args) {
        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("west");
        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);
        Bed bed = new Bed("modern", 2, 100, 2, 1);
        Lamp lamp = new Lamp(LampType.NORMAL, true, 5);
        Wardrobe wardrobe = new Wardrobe(120, 200, 50);
        Carpet carpet = new Carpet(200, 300, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

    }
}
