public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor ("Гарри Поттер", 10, 10,8,10,10);
        Gryffindor hermioneGranger = new Gryffindor ("Гермиона Грейнджер", 10, 10,10,10,9);
        Gryffindor ronWeasley = new Gryffindor ("Рон Уизли", 9, 10,10,10,10);

        Slytherin dracoMalfoy = new Slytherin ("Драко Малфой", 9, 10,10,10,9,6,7);
        Slytherin grahamMontague = new Slytherin ("Грэхэм Монтегю", 6, 10,10,5,10,6,7);
        Slytherin gregoryGoyle = new Slytherin ("Грегори Гойл", 9, 8,10,10,10,6,7);

        Puffendor zachariasSmit = new Puffendor("Захария Смит", 10, 6,8,10,10);
        Puffendor cedric = new Puffendor("Седрик Диггори", 9, 8,8,10,9);
        Puffendor justin = new Puffendor("Джастин Финч-Флетчли", 7, 10,8,8,10);

        Kogtevran zhouChang = new Kogtevran ("Чжоу Чанг", 10, 5,3,5,9,7);
        Kogtevran padmaPatil = new Kogtevran ("Падма Патил", 3, 10,3,8,9,7);
        Kogtevran marcusBelby = new Kogtevran ("Маркус Белби", 9, 10,3,5,9,7);


        harryPotter.describe();
        hermioneGranger.describe();
        ronWeasley.describe();
        dracoMalfoy.describe();
        grahamMontague.describe();
        gregoryGoyle.describe();
        zachariasSmit.describe();
        cedric.describe();
        justin.describe();
        zhouChang.describe();
        padmaPatil.describe();
        marcusBelby.describe();



        hermioneGranger.compare(harryPotter);
        grahamMontague.compare(dracoMalfoy);
        hermioneGranger.compare(gregoryGoyle);
        grahamMontague.compare(zachariasSmit);
        justin.compare(zachariasSmit);
        marcusBelby.compare(padmaPatil);
        marcusBelby.compare(harryPotter);



    }




}