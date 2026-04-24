package siniflar.ögrencibilgisistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;       // Sınav Notu
    int verbalNote; // Sözlü Notu
    double verbalWeight; // Sözlü notunun etkisi (Örn: 0.20)

    public Course(String name, String code, String prefix, double verbalWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalWeight = verbalWeight; // Her ders için farklı etki yüzdesi
        this.note = 0;
        this.verbalNote = 0;
    }

    // addTeacher ve printTeacher metotları aynı kalıyor...
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }
}
