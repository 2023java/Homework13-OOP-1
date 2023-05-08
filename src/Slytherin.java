public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name,magicPower,transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public void describe() {
        super.describe();
        System.out.println("Хитрость = " + cunning + ", " +
                "решительность = " + determination + ", " +
                "амбициозность = " + ambition + ", " +
                "находчивость = " + resourcefulness +", " +
                "жажда власти = " + thirstForPower );
    }

    public void compare (Slytherin student2) {
        int student1Score = this.getMagicPower()+ this.getTransgressionDistance()+ this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getThirstForPower();
        int student2Score = student2.getMagicPower()+ student2.getTransgressionDistance() +student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstForPower();
        if (student1Score > student2Score) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (student1Score < student2Score) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student2.getName() + " равны по своим качествам");
        }
    }


}
