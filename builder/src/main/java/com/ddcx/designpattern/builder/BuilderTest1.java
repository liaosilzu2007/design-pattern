package com.ddcx.designpattern.builder;

/**
 * Created by liaosi on 2017/9/21.
 */
public class BuilderTest1 {

    public static void main(String[] args) {
        House house = Derector.constructHouse(new HouseBuilderImpl());
        System.out.println(house.toString());
    }
}

class House {

    private String basic;
    private String wall;
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}

interface HouseBuilder {

    public abstract void buildeBasic();
    public abstract void buildeWall();
    public abstract void buildeRoofed();
    public abstract House buildeHouse();

}

class HouseBuilderImpl implements HouseBuilder {

    private House house;

    //具体的产品类对象的创建是在builder实现类的构造器中，导演类是不与产品发生直接联系的
    public HouseBuilderImpl() {
        this.house = new House();
    }

    @Override
    public void buildeBasic() {
        house.setBasic("打好地基");
    }

    @Override
    public void buildeWall() {
        house.setWall("砌砖");
    }

    @Override
    public void buildeRoofed() {
        house.setRoofed("封顶大吉");
    }

    @Override
    public House buildeHouse() {
        return house;
    }
}

class Derector {

    public static House constructHouse(HouseBuilder builder) {
        builder.buildeBasic();
        builder.buildeWall();
        builder.buildeRoofed();
        return builder.buildeHouse();
    }
}
