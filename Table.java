public class Table {
    public static void main (String[] args){
        String classmate1 = "Иванчо";
        String classmate2 = "Ани";
        String classmate3 = "Марийка";
        String classmate4 = "Пенчо";
        String classmate5 = "Бориславчо";
        byte grade1 =2;
        byte grade2 = 5;
        byte grade3 = 6;
        byte grade4 = 4;
        byte grade5 = 5;
        System.out.printf("|%-11S-|%d|%n",classmate1,grade1);
        System.out.printf("|%-11S-|%d|%n", classmate2,grade2);
        System.out.printf("|%-11S-|%d|%n",classmate3,grade3);
        System.out.printf("|%-11S-|%d|%n",classmate4,grade4);
        System.out.printf("|%-11S-|%d|%n",classmate5,grade5);
    }
}
