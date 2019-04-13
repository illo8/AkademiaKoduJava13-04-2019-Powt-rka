package pl.academy.code.pakiet;

public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public class Engine {
        private int power;

        public int getPower(){
            return power;
        }

        public void setPower (int power) {
            this.power = power;
        }
    }
}