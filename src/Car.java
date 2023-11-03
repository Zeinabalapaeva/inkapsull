public class Car {
   private String marca;
  private   String dateVyhoda;
   private String counter;

    public Car(String marca, String dateVyhoda, String counter) {
        this.marca = marca;
        this.dateVyhoda = dateVyhoda;
        this.counter = counter;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDateVyhoda() {
        return dateVyhoda;
    }

    public void setDateVyhoda(String dateVyhoda) {
        this.dateVyhoda = dateVyhoda;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", dateVyhoda='" + dateVyhoda + '\'' +
                ", counter='" + counter + '\'' +
                '}';
    }
}
