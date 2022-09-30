public class MethodOverloading {

    public static double calcFeetAndInchesToCentimeters(double feet , double inches){

        if ((feet >=0) && (inches >=0 && inches<=12)) {
            double cm =feet * 12 * 2.54;
            cm+= inches *2.54;
            System.out.println(feet + " feet + " + inches + " inches = " +cm + " cm" );
            return cm;

        }else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){

        if (inches < 0 ){
            return -1;
        }

        double remaininginches = (int) inches % 12;
        double feet = (int) inches /12;
        System.out.println(inches + " inches is equal to "+ feet +" feet and " + remaininginches + "inches");
        return calcFeetAndInchesToCentimeters(feet,remaininginches);

    }
}
