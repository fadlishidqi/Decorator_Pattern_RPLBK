public class SusuDecorator extends MinumanDecorator {
    public SusuDecorator(Minuman minuman) {
        super(minuman);
    }

    @Override
    public String getDeskripsi() {
        return minuman.getDeskripsi() + ", dengan susu";
    }

    @Override
    public double getHarga() {
        return minuman.getHarga() + 2000; 
    }
}

