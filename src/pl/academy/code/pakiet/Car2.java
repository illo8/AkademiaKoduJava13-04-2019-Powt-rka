package pl.academy.code.pakiet;

public class Car2 {
    private Engine engine;



    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static class Engine {    //jest statyczny wiec w main moge stworzyc bez obiektu
        private int power;

        public int getPower(){
            return power;
        }

        public void setPower (int power) {
            this.power = power;
        }
    }
}