package Task22.models;

public class ToysWin extends Toys {
    String dataTime;

    public ToysWin(int id, String name, int count, float frequencyOfLoss, String dataTime) {
        super(id, name, count, frequencyOfLoss);
        this.dataTime = dataTime;
    }

    @Override
    public String toString() {
        return "Идентификатор: " + id + ", название: " + name + ", количество: " + count +
                ", % выпадения: " + frequencyOfLoss + ", дата выигрыша: " + dataTime;
    }

    public String getDataTime() {
        return dataTime;
    }
}
