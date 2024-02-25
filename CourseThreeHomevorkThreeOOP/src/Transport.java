public abstract class Transport implements Repair{
    private String modelName;
    private int wheelsCount;


    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;

    }
    public void updateTyre() {
        System.out.println("Меняем шину");
    }


    public String toString() {
        return "модель - " + modelName + ": количество колес - " + wheelsCount;
    }

   @Override
    public void check() {
       System.out.println("Обслуживаем - " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
   }
}
