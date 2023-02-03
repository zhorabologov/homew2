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

        int workHours = 3;
        System.out.println("Значение переменной workHours с типом int равно " + workHours);
        byte dogs = 5;
        System.out.println("Значение переменной dogs с типом byte равно " + dogs);
        short screws = 20;
        System.out.println("Значение переменной screws с типом short равно " + screws);
        long lg = 4_500_000L;
        System.out.println("Значение переменной lg с типом long равно " + lg);
        float fb = 3.1563F;
        System.out.println("Значение переменной fb с типом float равно " + fb);
        double dd = 3.8888;
        System.out.println("Значение переменной dd с типом double равно " + dd);

        float f = 27.15F;
        long l = 987678965549L;
        double d = 2.786;
        char c = 569;
        short s = -159;
        int i = 27897;
        byte b = 67;

        int studentsLudmila = 23;
        int studentsAnna = 27;
        int studentsKate = 30;
        int totalPaper = 480;
        int totalStudents = studentsLudmila + studentsAnna + studentsKate;
        int paperStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");

        int bottles = 16;
        int minutes = 2;
        int bottlesoneMinute = bottles / minutes;
        int bott20Min = bottlesoneMinute * 20;
        int bottHour = bott20Min * 3;
        int bottDay  = bottHour * 24;
        int bottThreedays = bottDay * 3;
        int bottMonth = bottThreedays * 10;
        System.out.println("За 20 минут машина произвела " + bott20Min + " бутылок");
        System.out.println("За сутки машина произвела " + bottDay + " бутылок");
        System.out.println("За 3 дня машина произвела " + bottThreedays + " бутылок");
        System.out.println("За месяц машина произвела " + bottMonth + " бутылок");

        int totalJar = 120;
        int whiteJarclass = 2;
        int brownJarclass = 4;
        int totalClass = totalJar / (whiteJarclass + brownJarclass);
        int totalWhite = whiteJarclass * totalClass;
        int totalBrown = brownJarclass * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        int banana = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEggs = 70;
        int totalWeightGram = banana * weightBanana + milk * weightMilk + iceCream * weightIceCream + eggs * weightEggs;
        double totalWeightKg = totalWeightGram / 1_000D;
        System.out.println("Общий вес в граммах " + totalWeightGram + " вес в кг " + totalWeightKg);

        int loseWeightG = 7_000;
        int loseWeightMin = 250;
        int loseWeightMax = 500;
        double dayMax = (double) loseWeightG / loseWeightMin;
        double dayMin = (double) loseWeightG / loseWeightMax;
        double averageWeigh = (loseWeightMin + loseWeightMax) / 2D;
        double averageDay = loseWeightG / averageWeigh;
        System.out.println("Максимальное количество дней для похудения " + dayMax);
        System.out.println("Минимальное количество дней для похудения " + dayMin);
        System.out.println("Среднее количество дней для похудения " + averageDay);

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double precent = 1.1;
        double newMasha = masha * precent;
        double newDenis = denis * precent;
        double newKristina = kristina * precent;

        double yearMasha = 12 * masha;
        double newYearMasha = 12 * newMasha;
        double yearDenis = 12 * denis;
        double newYearDenis = 12 * newDenis;
        double yearKristina = 12 * kristina;
        double newYearKristina = 12 * newKristina;
        System.out.println("Маша теперь получает " + newMasha + " годовой доход вырос на " + (newYearMasha - yearMasha) + " рублей");
        System.out.println("Денис теперь получает " + newDenis + " годовой доход вырос на " + (newYearDenis - yearDenis) + " рублей");
        System.out.println("Кристина теперь получает " + newKristina + " годовой доход вырос на " + (newYearKristina - yearKristina) + " рублей");





















    }
}

