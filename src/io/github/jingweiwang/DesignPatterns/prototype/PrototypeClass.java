package io.github.jingweiwang.DesignPatterns.prototype;

public class PrototypeClass implements Cloneable {
    private String text;

    public PrototypeClass() {
        System.out.println("PrototypeClass 的构造函数被执行了。");
    }

    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
