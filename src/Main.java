public class Main {
    public static void main(String[] args) {
        var dog = 8;
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

        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = 3.5 * 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var weightDifference = totalWeight - boxer2;
        System.out.println("Разница в весе " + weightDifference + " кг");

        var hours = 640;
        var workingDay = 8;
        var employees = hours / workingDay;
        System.out.println("Всего сотрудников " + employees);
        var additionalStaff = 94;
        var totalEmployees = employees + additionalStaff;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        var dividedHours = totalEmployees / hours;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего часов" + dividedHours + " может быть распределено между ними");







    }
}

