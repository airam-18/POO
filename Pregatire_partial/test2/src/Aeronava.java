public abstract class Aeronava{
    private String marca;
    private String model;

    Aeronava(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    String getMarca() {
        return marca;
    }
    String getModel() {
        return model;
    }

    void Model_Marca()
    {
        System.out.println("Modelul "+model+"\n"+"Marca "+marca);
    }
}
