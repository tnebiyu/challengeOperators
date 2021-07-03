public class myClass {
    public static void main(String[] args) {
        double value1 =20.00;
        double value2 = 80.00;
        double sum = value1 + value2;
        double result = sum * 100;
        double reminder = result % 40.00;
        boolean isNoReminder= reminder == 0?true:false;
        System.out.println("reminder " + isNoReminder);
        if (!isNoReminder){
            System.out.println("got some remainder");

        }
        else
            System.out.println("didn't get reminder");
    }
}