package Task22.models;

public class Toys {
    int id;
    String name;
    int count;
    float frequencyOfLoss;

    public Toys(int id, String name, int count, float frequencyOfLoss) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.frequencyOfLoss = frequencyOfLoss;
    }

    //getters
    public int getId() {
        return id;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getFrequencyOfLoss() {
        return frequencyOfLoss;
    }

    public void setFrequencyOfLoss(float frequencyOfLoss) {
        this.frequencyOfLoss = frequencyOfLoss;
    }

    @Override
    public String toString() {
        return "Идентификатор: " + id + ", название: " + name + ", количество: " + count +
                ", % выпадения: " + frequencyOfLoss +
                '.';
    }
}