 class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor (String name, int magicPower, int transgressionDistance, int nobility,int honor,int bravery) {
        super(name,magicPower,transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

     public int getNobility() {
         return nobility;
     }

     public int getHonor() {
         return honor;
     }

     public int getBravery() {
         return bravery;
     }

     public void describe() {
        super.describe();
        System.out.println("Благородство = " + nobility + ", " +
                "честь = " + honor + ", " +
                "храбрость = " + bravery);
    }
//
    public void compare(Gryffindor student2) {
        int sum1 = this.getMagicPower()+ this.getTransgressionDistance() +this.nobility + this.honor + this.bravery;
        int sum2 = student2.getMagicPower()+ student2.getTransgressionDistance() +student2.nobility + student2.honor + student2.bravery;
        if (sum1 > sum2) {
            System.out.println(this.getName() +" лучший Гриффиндорец, чем "+student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() +" лучший Гриффиндорец, чем "+this.getName());
        } else {
            System.out.println("Оба студента Гриффиндорцы равны");
        }
    }

 }
