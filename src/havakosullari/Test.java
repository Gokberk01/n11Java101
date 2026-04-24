package havakosullari;

public class Test {
    public static void main(String[] args) {
        int sicaklik = 12;
        if (sicaklik < 5) {
            System.out.println("Kayak");
        } else if (sicaklik < 15) { // Burada sıcaklığın zaten 5'ten büyük olduğu biliniyor
            System.out.println("Sinema");
        } else if (sicaklik < 25) { // Burada sıcaklığın zaten 15'ten büyük olduğu biliniyor
            System.out.println("Piknik");
        } else {
            System.out.println("Yüzme");
        }
    }
}
