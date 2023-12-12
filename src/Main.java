public class Main {
    public static void main(String[] args)

    {
    // 1
    int age = 15;
    if (age >= 18)
        { System.out.println("Вам 18 лет или больше"); }
    else
        { System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать"); }

    // 2
    int temperature = 0;
    if (temperature <= 5)
        { System.out.println("На улице " + temperature + " градусов, нужно надеть шапку"); }
    else
        { System.out.println("На улице " + temperature + " градусов, можно идти без шапки"); }

    // 3
    int velocity = 50;
    if (velocity >= 60)
        { System.out.println("Если скорость " + velocity + " км/ч, придется заплатить штраф"); }
    else
        { System.out.println("Если скорость " + velocity + " км/ч, можно ездить спокойно"); }

    // 4
    int personAge = 10;
    if (personAge <= 6 && personAge >= 2)
        { System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад"); }
    else if (personAge <=17 && personAge >= 7)
        { System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу"); }
    else if (personAge <= 24 && personAge >= 18)
        { System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет"); }
    else
        { System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу"); }

    // 5
    int childAge = 4;
    if (childAge <= 5 && childAge >= 0)
        { System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе"); }
    else if (childAge <= 14 && childAge > 5)
        { System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого"); }
    else
        { System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого"); }

    // 6
    int seatNumber = 110;
    int carriageSeat = 102;
    int seatInCarriage = 60;
    int standingSeat = carriageSeat - seatInCarriage;

    if (seatNumber <= carriageSeat && seatNumber >= seatInCarriage)
        { System.out.println("Остались только стоячие места"); }
    if (seatNumber <= seatInCarriage)
        { System.out.println("Вам повезло! Будете ехать сидя"); }
    else if (seatNumber >= carriageSeat)
        { System.out.println("Вагон полон, мест нет"); }

    // 7
    int one = 11;
    int two = 9;
    int three = 7;
    int minNumber = 0;

    if (one < two)
        { minNumber = one;}
    else
        { minNumber = two;}
    if (minNumber > three)
        { minNumber = three;}
    System.out.println("Минимальное число " + minNumber);
    }
}