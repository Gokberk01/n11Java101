package siniflar.ögrencibilgisistemi;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    // Hem sınav hem sözlü notlarını topluca girmek için güncelledik
    public void addBulkExamNote(int mat, int matVerbal, int fizik, int fizikVerbal, int kimya, int kimyaVerbal) {
        if (mat >= 0 && mat <= 100) this.mat.note = mat;
        if (matVerbal >= 0 && matVerbal <= 100) this.mat.verbalNote = matVerbal;

        if (fizik >= 0 && fizik <= 100) this.fizik.note = fizik;
        if (fizikVerbal >= 0 && fizikVerbal <= 100) this.fizik.verbalNote = fizikVerbal;

        if (kimya >= 0 && kimya <= 100) this.kimya.note = kimya;
        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) this.kimya.verbalNote = kimyaVerbal;
    }

    public void calcAvarage() {
        // Her dersin ortalamasını kendi ağırlığına göre hesaplıyoruz
        double matAvg = (this.mat.note * (1 - this.mat.verbalWeight)) + (this.mat.verbalNote * this.mat.verbalWeight);
        double fizikAvg = (this.fizik.note * (1 - this.fizik.verbalWeight)) + (this.fizik.verbalNote * this.fizik.verbalWeight);
        double kimyaAvg = (this.kimya.note * (1 - this.kimya.verbalWeight)) + (this.kimya.verbalNote * this.kimya.verbalWeight);

        this.avarage = (matAvg + fizikAvg + kimyaAvg) / 3.0;
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Genel Ortalama : %.2f \n", this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik -> Sınav: " + mat.note + " Sözlü: " + mat.verbalNote);
        System.out.println("Fizik     -> Sınav: " + fizik.note + " Sözlü: " + fizik.verbalNote);
        System.out.println("Kimya     -> Sınav: " + kimya.note + " Sözlü: " + kimya.verbalNote);
    }
}
