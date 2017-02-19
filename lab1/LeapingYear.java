public class LeapingYear{
    public static void TestLeapingYear(int year){
        if (year % 4 != 0){
            System.out.print(year);
            System.out.println(" is not a leap year.");
        }else{
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.print(year);
                    System.out.println(" is a leap year.");
                }else{
                    System.out.print(year);
                    System.out.println(" is not a leap year.");
                }
            }else{
                System.out.print(year);
                System.out.println(" is a leap year.");
            }
        }
    }

    public static void main(String[] args){
        int year = 2001;
        int year2 = 4000;
        int year3 = 1900;
        TestLeapingYear(year);
        TestLeapingYear(year2);
        TestLeapingYear(year3);
        //test:
        System.out.println(year + " is not a leap year");
    }
}