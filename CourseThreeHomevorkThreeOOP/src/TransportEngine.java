public class TransportEngine extends Transport{

    public TransportEngine (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}



