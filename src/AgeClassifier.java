public class AgeClassifier {

    public static void main(String[] args) {

        int age=10;

        String Catrgory=(age > 18) ?
                ((age > 65) ?  "Senior Citizen" : "Adult") : "Minor";

        System.out.println("Age " + age + " : " + Catrgory);
    }
}
