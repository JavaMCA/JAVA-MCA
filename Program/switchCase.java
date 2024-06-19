
//java program to demonstrate the example of switch statement.
//where are printing month name for the given month number.
import java.util.*;
class switchCase{
    public static void main(String args[]){
    int month;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter month number: ");
    month=sc.nextInt();
    String monthname ="";
    switch(month){
        case 1:monthname="January";
        break;
        case 2:monthname="February";
        break;
        case 3:monthname="March";
        break;
        case 4: monthname="April";
        break;
        case 5: monthname="May";
        break;
        case 6: monthname="June";
        break;
        case 7: monthname="July";
        break;
        case 8:monthname="August";
        break;
        case 9: monthname="September";
        break;
        case 10: monthname="October";
        break;
        case 11:monthname="November";
        break;
        case 12: monthname="December";
        default:System.out.println("invaild month number");
    }
    System.out.println(monthname);

    }
}
