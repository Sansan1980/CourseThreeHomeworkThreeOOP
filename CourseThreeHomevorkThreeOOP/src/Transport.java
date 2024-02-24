public abstract class Transport implements ServiceStation {
    private String modelName;
    private int wheelsCount;


    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;

    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {

    }

    public String getModelName() {
        return modelName;
    }

    public void updateTyre() {
        System.out.println("Меняем шину");
    }

    public String toString() {
        return "модель - " + modelName + ": количество колес - " + wheelsCount;
    }

}
