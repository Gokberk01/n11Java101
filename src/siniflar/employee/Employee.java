package siniflar.employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu Metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi Hesaplama
    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    // Bonus Hesaplama
    public double bonus() {
        if (this.workHours > 40) {
            int extraHours = this.workHours - 40;
            return extraHours * 30;
        }
        return 0;
    }

    // Maaş Artışı Hesaplama (Mevcut yıl: 2021)
    public double raiseSalary() {
        int yearDiff = 2021 - this.hireYear;

        if (yearDiff < 10) {
            return this.salary * 0.05;
        } else if (yearDiff > 9 && yearDiff < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    // Bilgileri Yazdırma
    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = this.salary - tax + bonus;
        double totalSalary = salaryWithTaxAndBonus + raise;

        return  "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + tax + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + raise + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus + "\n" +
                "Toplam Maaş : " + totalSalary;
    }

}