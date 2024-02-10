public class Main {
    public static void main(String[] args) {

        System.out.println("___________________________________________________________________________________________");
        System.out.println("___________________________Условные операторы. Часть 2.____________________________________");
        System.out.println("___________________________________________________________________________________________");

        System.out.println("___________________________________________________________________________________________");
        System.out.println("_____________________________________Задача 1______________________________________________");
        System.out.println("___________________________________________________________________________________________");
        //        Задача 1
//        У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит на сайт с телефона, ему
//        предлагается скачать приложение с учетом того, какая операционная система у пользователя.
//        Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение:
//
//        Для iOS — «Установите версию приложения для iOS по ссылке».
//        Для Android — «Установите версию приложения для Android по ссылке».
//        Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).

        int clientOS = 1;
        // 0 - iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

// Я не совсем понял задачу, на самом деле. Возможно мне нужно было отталкиваться от логического оператора ||, однако на практике,
// делал бы через switch наверное, ведь есть поддержка разных версий, кастомные прошивки и т.п. Логично, что этот список будет расти
// со временем.


//        switch (clientOS) {
//            case 1: // iOS
//                System.out.println("Установите версию приложения для iOS по ссылке");
//                break;
//            case 2: // iOS
//                System.out.println("Установите версию приложения для Android по ссылке");
//                break;
//            default:
//                System.out.println("Извините, но ваша OS не поддерживается программой");
//
//        }
        System.out.println("___________________________________________________________________________________________");
        System.out.println("_____________________________________Задача 2______________________________________________");
        System.out.println("___________________________________________________________________________________________");

        // Задача 2
        // Усложним предыдущую задачу. Теперь нам нужно знать не только операционную систему телефона, но и год его создания.
        //
        //Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
        //
        //Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
        //
        //Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
        //Для Android: «Установите облегченную версию приложения для Android по ссылке».
        //Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
        //
        //Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год.
        //
        //Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).

        int clientDeviceYear = 2015;

        // 0 - iOS, 1 — Android
        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println("___________________________________________________________________________________________");
        System.out.println("_____________________________________Задача 3______________________________________________");
        System.out.println("___________________________________________________________________________________________");
        //Задача 3
        //Напишите программу, которая определяет, является ли год високосным или нет.
        //
        //Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
        //
        //Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        // « …. год является високосным» или «... год не является високосным».
        //
        //Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый. Также високосным
        // является каждый четырехсотый год. Год должен быть больше, чем 1584 (в котором был введен високосный год)

        int year = 2024;
        boolean leapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) && (year > 1584);
        // Мне не особо нравится запихивать кучу условий в одну переменную, но в данном случае, условия того какой год
        // считать високосным, меняются крайне редко. Пусть это и читается плохо, но менять это придется не часто
        // (если работает корректно). Но лучше всего - посмотреть готовый код в интернете и реализовать проверку на
        // високосный год так, как ее делает большинство - для читаемости кода.
        if (leapYear == true) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Посмотрел как делают другие - не вводят boolean, а сразу прописывают условие в if. Как по мне - это имеет
        // не лучший вид. Так же, никто особо не проверяет больше ли год 1584. Думаю, что можно было бы вынести это условие
        // куда-нибудь в else, но мне легче понимать какие строки кода за что отвечают, когда все эти проверки в одном месте, хотя
        // если разнести эти условия по разным строкам - будет легче локализовать ошибки.

        System.out.println("___________________________________________________________________________________________");
        System.out.println("_____________________________________Задача 4______________________________________________");
        System.out.println("___________________________________________________________________________________________");

        //Задача 4
        // В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена 
        //его карта, нужно знать расстояние от офиса до адреса доставки.
        //
        // Правила доставки такие:
        //
        // Доставка в пределах 20 км занимает сутки.
        // Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        // Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        // Свыше 100 км доставки нет.
        // То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //
        // Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
        //
        // Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.

        int deliveryDistance = 95;
        // задано задачей
        int deliveryDays = 1;
        // наш минимальный срок доставки - 1 день.

        int zoneOneGap = 0;
        int zoneTwoGap = 1;
        int zoneThreeGap = 2;
        // Мы заранее определяем, сколько дней добавляем к срокам с каждой новой зоной. Сперва я подумал сделать через deliveryDays ++,
        // но если я делаю конструкцию на if, то у меня будут проблемы с корректным инкриминированием значения deliveryDays, ведь я вроде
        // как должен засунуть инкриминацию уже под if, а если условие выполнятся не будет, то и инкриминация на второй зоне не произойдет
        // и в третьей зоне я получу увеличение доставки только на 1 день, вместо 2. Поэтому, я решил вынести эти значения в отдельные
        // переменные, т.к. по логике, они могут меняться в зависимости от времени года или штата отдела доставки.

        int zoneOneBorder = 20;
        int zoneTwoBorder = 60;
        int zoneThreeBorder = 100;
        // По той же логике вынес границы зон доставки в отдельные переменные,
        // т.к. отдел доставки может быть оптимизирован и мы сможем успевать доставлять карты уже на 40км в пределах дня, допустим.


        boolean deliveryZoneOne = (deliveryDistance <= zoneOneBorder);
        boolean deliveryZoneTwo = ((zoneOneBorder < deliveryDistance) && (deliveryDistance <= zoneTwoBorder));
        boolean deliveryZoneThree = ((zoneTwoBorder < deliveryDistance) && (deliveryDistance <= zoneThreeBorder));
        if (deliveryZoneOne) {

            deliveryDays = deliveryDays + zoneOneGap;
            System.out.println(deliveryDistance + "км - это первая зона доставки. Потребуется дней: " + deliveryDays);
        } else if (deliveryZoneTwo) {

            deliveryDays = deliveryDays + zoneTwoGap;

            System.out.println(deliveryDistance + "км - это вторая зона доставки. Потребуется дней: " + deliveryDays);
        } else if (deliveryZoneThree) {

            deliveryDays = deliveryDays + zoneThreeGap;
            System.out.println(deliveryDistance + "км - это третья зона доставки. Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("До вас: " + deliveryDistance + "км." + " К сожалению, свыше 100 км доставки нет.");
        }

        System.out.println("___________________________________________________________________________________________");
        System.out.println("_____________________________________Задача 5______________________________________________");
        System.out.println("___________________________________________________________________________________________");
        //Задача 5
        // Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        // Например, 1-й месяц (он же январь) принадлежит к сезону зима.
        //
        //Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
        //
        //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-й месяц - " + "Январь. Зимний сезон.");
                break;
            case 2:
                System.out.println(monthNumber + "-й месяц - " + "Февраль. Зимний сезон.");
                break;
            case 3:
                System.out.println(monthNumber + "-й месяц - " + "Март. Весенний сезон.");
                break;
            case 4:
                System.out.println(monthNumber + "-й месяц - " + "Апрель. Весенний сезон.");
                break;
            case 5:
                System.out.println(monthNumber + "-й месяц - " + "Май. Весенний сезон.");
                break;
            case 6:
                System.out.println(monthNumber + "-й месяц - " + "Июнь. Летний сезон.");
                break;
            case 7:
                System.out.println(monthNumber + "-й месяц - " + "Июль. Летний сезон.");
                break;
            case 8:
                System.out.println(monthNumber + "-й месяц - " + "Август. Летний сезон.");
                break;
            case 9:
                System.out.println(monthNumber + "-й месяц - " + "Сентябрь. Осенний сезон.");
                break;
            case 10:
                System.out.println(monthNumber + "-й месяц - " + "Октябрь. Осенний сезон.");
                break;
            case 11:
                System.out.println(monthNumber + "-й месяц - " + "Ноябрь. Осенний сезон.");
                break;
            case 12:
                System.out.println(monthNumber + "-й месяц - " + "Декабрь. Зимний сезон.");
                break;
            default:
                System.out.println(monthNumber + "-й месяц - " + "неверно задан номер месяца. Номер может быть указан только целыми числами от 1 до 12!");

                // Хотел положить сезоны в отдельную переменную, но возни с этим больше, чем со всей задачей, да и логика программы не подразумевает,
                // что у нас будет меняться система летоисчисления. Хотя, было бы прикольно знать сегодняшнюю дату по версии, например, календаря майя =)
                // Ну хоть добавил отображение месяца, который мы задаем. Полезно видеть, что программа приняла на ввод, когда себя проверяешь.


        }


    }

}