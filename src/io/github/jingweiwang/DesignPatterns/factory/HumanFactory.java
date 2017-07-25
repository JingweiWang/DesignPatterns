package io.github.jingweiwang.DesignPatterns.factory;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (T) human;
    }
}
