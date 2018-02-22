public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        Functii functiaPers1 = new Functii();
        person1.name = "Victor";
        person1.age = 50;
        person1.sayHello();
        person1.speek();
        functiaPers1.functia = "Timplar";
        functiaPers1.stagiu = 10;
        int years1 = person1.pensionare();

        System.out.println("Persoana se pensioneaza peste " + years1 + " ani.");
        System.out.println("Functia care o ocupa este - " + functiaPers1.functia + ". Stagiu - " + functiaPers1.stagiu + " ani.");


        Person person2 = new Person();
        Functii functiaPers2 = new Functii();
        person2.name = "Ion";
        person2.age = 28;
        functiaPers2.functia = "Programmer";
        person2.sayHello();
        person2.speek();
        int years2 = person2.pensionare();
        System.out.println("Are profesia de " + functiaPers2.functia);

        System.out.printf("Persoana se pensioneaza peste " + years2 + " ani.");

    }

}

class Person {
    String name;
    int age;

    int pensionare(){
        int years = 65 - age;
        return years;
    }

    void sayHello() {
        System.out.println("Salut");
    }

    void speek(){
        System.out.printf("Ma cheama " + name + " si am "+ age + " de ani. ");
    }


}

class Functii {

    String functia;
    int stagiu;

    void function(){
    String f1;
    }

}
