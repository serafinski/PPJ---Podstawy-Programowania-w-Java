public class Zadanie10_cw20 {
    public static void main(String[] args) {
        Person person1 = new Person("Tomasz", 1999);
        Person person2 = new Person("Michal");
        Person person3 = new Person("Jerzy", 1971);
        Person person4 = new Person("Aleksandra",1998);

        Person[] tab = {person1, person2,person3,person4};

        System.out.println(person1.getName());
        System.out.println(person2.getAge());

        Person.getOlder(person3, person4);
        Person.getOldest(tab);
    }
}
class Person{
    private String name;
    private int birthYear;

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name){
        this(name,1990);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return 2021-birthYear;
    }

    public static Person getOlder(Person one, Person two){
        if (one.birthYear> two.birthYear){
            System.out.println("Starszy/a jest " + one.getName() + " o wieku: " + one.getAge());
            return one;
        }
        else{
            System.out.println("Starszy/a jest "+ two.getName() + " o wieku: " + two.getAge());
            return two;
        }
    }

    public static Person getOldest(Person[] tab){
        Person tmp = tab[0];
        for(int i =0; i<tab.length; i++){
            if (tab[i].getAge()>tmp.getAge())
                tmp = tab[i];
        }
        System.out.println("Najstarszy/a jest " + tmp.getName() + " o wieku: " + tmp.getAge());
        return tmp;
    }
}