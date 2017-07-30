package io.github.jingweiwang.DesignPatterns.builder.example;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getBenzModelA() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);

        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBenzModelB() {
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);

        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getBMWModelA() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);

        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    public BMWModel getBMWModelB() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);

        return (BMWModel) this.bmwBuilder.getCarModel();
    }
}
