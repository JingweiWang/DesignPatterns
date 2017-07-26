package io.github.jingweiwang.DesignPatterns.factory;

public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
        Human whiteHuman = abstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.getTalk();

        Human blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.getTalk();

        Human yellowHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.getTalk();
    }
}
