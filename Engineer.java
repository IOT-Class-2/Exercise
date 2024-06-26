package com.sinemsalis.daytwo;

public class Engineer extends Employee {
    // 'extends' employee, engineer classını employee sınıfından miras aldığını belirtir.
    // 'employee' sınıfından miras aldığını belirtir. Yani 'engineer' sınıfının tüm özelliklerine ve metotlarına sahip olur.


    // Constructure ifade asla return döndürmez.
    public Engineer(String name,double salary, int age){ // Bu sınıfın oluşturulurken çağırılan metodudur.
        super(name, salary, age); // 'Employee' sınıfının yapıcı metodunu çağırır. 'name', 'salary', 'age' parametrelerini
        // 'Employee' sınıfına iletir.
        // Bu sınıfın yapıcı metodunu çağırır.
    }

    public double getAnnualBonus(){ // Engineer in yıllık bonusunu sağlayan metottur. Ve bu metodu döndürür.
        return super.salary * .05;
        // Bu metot Employee sınıfından alınana maaş/salary değişkenine erişir.
        // Ne ile erişir? super anahtar kelimesi ile erişir.
        // Metotun genel işlevi ise maaşın %5'ini hesaplar ve döndürür. Bu engineerin yıllık bonusunu belirler.
    }


}
