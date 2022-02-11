public class Cotxe


{

//1. Crea una classe Cotxe que tingui els atributs model i matrícula,
// i els corresponents mètodes set i get per a cada un.


    private String model;

    private int matricula;

    public int getMatricula() {

        return matricula;
    }

    public String getModel() {
        return model;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setModel(String model) {
        this.model = model;
    }
}