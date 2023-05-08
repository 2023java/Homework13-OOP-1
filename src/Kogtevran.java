class Kogtevran extends Hogwarts {

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public Kogtevran(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public void describe() {
        super.describe();
        System.out.println("Ум = " + intelligence + ", " +
                "мудрость = " + wisdom + ", " +
                "остроумие = " + wit + ", " +"творчество = " + creativity );
    }
    public void compare(Kogtevran student2) {
        int sum1 = this.getMagicPower()+ this.getTransgressionDistance() +this.intelligence + this.wisdom + this.wit+this.creativity;
        int sum2 = student2.getMagicPower()+ student2.getTransgressionDistance() +student2.intelligence + student2.wisdom + student2.wit+student2.creativity;
        if (sum1 > sum2) {
            System.out.println(this.getName() +" лучший Когтевранец, чем "+student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() +" лучший Когтевранец, чем "+this.getName());
        } else {
            System.out.println("Оба студента Когтеврана равны");
        }
    }



}
