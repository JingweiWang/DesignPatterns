package io.github.jingweiwang.DesignPatterns.prototype;

public class Client {
    public static void main(String[] args) {
        PrototypeClass prototypeClass = new PrototypeClass();

        PrototypeClass clone1 = prototypeClass.clone();
        clone1.setText("clone1");

        PrototypeClass clone2 = prototypeClass.clone();
        clone2.setText("clone2");

        PrototypeClass clone3 = prototypeClass.clone();
        clone3.setText("clone3");

        System.out.println("clone1.getText(): " + clone1.getText());
        System.out.println("clone2.getText(): " + clone2.getText());
        System.out.println("clone3.getText(): " + clone3.getText());
    }
}
