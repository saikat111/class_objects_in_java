import java.util.Scanner;

class ShowStudentData {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        int num;
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        System.out.println("Multiplication Table of " + num);
        Table table = new Table();
        /*table.m();*/
        table.m(num);
        System.out.println("**************************");
        StudentMe studentMe = new StudentMe();
        studentMe.print();
        studentMe.pprint("a", "b");
        System.out.println(studentMe.rprint("aaaaaa"));
        System.out.println("**************************");
        Student showData = new Student();
        String name ;
        String ad;
        String phone;
        name = showData.name;
        phone = showData.ph;
        ad = showData.address;
        System.out.println(name);
        System.out.println(phone);
        System.out.println(ad);
        System.out.println("**************************");
        System.out.println(showData.id);
        System.out.println(showData.name);
        System.out.println(showData.address);
        System.out.println(showData.ph);
    }
}
