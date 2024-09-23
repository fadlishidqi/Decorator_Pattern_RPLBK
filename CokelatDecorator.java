public class CokelatDecorator extends MinumanDecorator {
    public CokelatDecorator(Minuman minuman) {
        super(minuman);
    }

    @Override
    public String getDeskripsi() {
        return minuman.getDeskripsi() + ", dengan cokelat";
    }

    @Override
    public double getHarga() {
        return minuman.getHarga() + 5000;
    }
}