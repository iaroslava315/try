//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Привет, мир!");

        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        var dog2 = 8.0;
        dog2 = dog2 - 3.5;
        System.out.println(dog2);
        var cat2 = 3.6;
        cat2 = cat2 - 1.6;
        System.out.println(cat2);
        var paper2 = 763789;
        paper2 = paper2 - 7639;
        System.out.println(paper2);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weight = boxer1 + boxer2;
        System.out.println("Общая масса двух бойцов " + weight + " кг");
        var weighLeft = boxer1 - boxer2;
        System.out.println("Разница между массами бойцов " + weighLeft + " кг");
        var overload = boxer2 % boxer1;
        System.out.println(overload);

        var allHours = 640;
        var hoursForOnePerson = 8;
        var allPersons = allHours / hoursForOnePerson;
        System.out.println("Всего работников в компании - " + allPersons + " человек");
        allPersons = allPersons + 94;
        allHours = allPersons * 8;
        System.out.println("Если в компании работает " + allPersons + " человек, то всего " + allHours + " часов работы может быть поделено между сотрудниками");


    }
}