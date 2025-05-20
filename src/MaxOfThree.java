public class MaxOfThree {

    public static void main(String[] args) {

        int N1=20,N2=70,N3=40;

        int max=(N1 >= N2) ?
                ((N1 >= N3) ? N1 : N3) :
        ((N2 >= N3) ? N2 : N3);
        System.out.println("Maxium Number : "+ max);

    }
}
