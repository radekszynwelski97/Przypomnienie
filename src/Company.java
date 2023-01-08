public class Company {

    public static void main(String[] args) {

        Employye employye = new Employye();
        employye.name = "Jan";
        employye.surName = "Kowalski";
        employye.theYearOfBirth = 1992;
        employye.yearsOfWorking = 5;

        Employye employye1 = new Employye();
        employye1.name = "Krzysztof";
        employye1.surName = "Zima";
        employye1.theYearOfBirth = 1290;
        employye1.yearsOfWorking = 10;

        Employye employye2 = new Employye();
        employye2.name = "Waldek";
        employye2.surName = "www";
        employye2.theYearOfBirth = 1560;
        employye2.yearsOfWorking = 1;

        System.out.println(" W naszej firmie pracują następujące osoby : ");
        System.out.println(employye1.name + " " + employye1.surName + " " + " urodzony :" + employye.theYearOfBirth +
                " " + " staż pracy : " + " " + employye.yearsOfWorking);
        System.out.println(employye2.name + " " + employye2.surName + " " + "urodzony : " + " " + employye2.theYearOfBirth +
                " " + "staż pracy to : " + " " + employye2.yearsOfWorking);
        System.out.println(employye1.name + " " + employye1.surName + " " + "urodzony : " + " " + employye1.theYearOfBirth +
                " " + " staż pracy to : " + " " + employye1.yearsOfWorking);

    }

}
