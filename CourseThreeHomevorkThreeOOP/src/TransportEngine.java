public abstract class TransportEngine extends Transport {

    public TransportEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}




