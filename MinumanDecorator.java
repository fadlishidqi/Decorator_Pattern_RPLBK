public abstract class MinumanDecorator implements Minuman {
    protected Minuman minuman;

    public MinumanDecorator(Minuman minuman) {
        this.minuman = minuman;
    }

    @Override
    public String getDeskripsi() {
        return minuman.getDeskripsi();
    }

    @Override
    public double getHarga() {
        return minuman.getHarga();
    }
}
