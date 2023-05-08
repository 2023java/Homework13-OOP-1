class Puffendor extends Hogwarts {

        private int diligence;
        private int loyalty;
        private int honesty;

        public int getDiligence() {
                return diligence;
        }

        public int getLoyalty() {
                return loyalty;
        }

        public int getHonesty() {
                return honesty;
        }

        public Puffendor(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
                super(name, magicPower, transgressionDistance);
                this.diligence = diligence;
                this.loyalty = loyalty;
                this.honesty = honesty;
        }
        public void describe() {
                super.describe();
                System.out.println("Трудолюбивость = " + diligence + ", " +
                        "верность = " + loyalty + ", " +
                        "честность = " + honesty);
        }
        public void compare(Puffendor student2) {
                int sum1 = this.getMagicPower()+ this.getTransgressionDistance() +this.diligence + this.loyalty + this.honesty;
                int sum2 = student2.getMagicPower()+ student2.getTransgressionDistance() +student2.diligence + student2.loyalty + student2.honesty;
                if (sum1 > sum2) {
                        System.out.println(this.getName() +" лучший Пуффендуец, чем "+student2.getName());
                } else if (sum1 < sum2) {
                        System.out.println(student2.getName() +" лучший Пуффендуец, чем "+this.getName());
                } else {
                        System.out.println("Оба студента Пуффендуя равны");
                }
        }



}