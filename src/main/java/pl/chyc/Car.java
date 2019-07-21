package pl.chyc;

public class Car {
    private Engine engine;
    private Part part;

    public Part getPart() {
        return part;
    }

    public Car(){

    }

    public Car(Engine engine, Part part) {
        this.engine = engine;
        this.part = part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
