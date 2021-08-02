package Lesson05;

public class InfoEmployees {

    public static void main(String[] args) {
        System.out.println("Something start");
        Employees Employees1 = new Employees();

        System.out.println("Create array");
        System.out.println("========================");

        Employees[] empArray = new Employees[5];
        for (int i = 0; i < empArray.length; i++){
           empArray[i] = new Employees();
        }
        System.out.println("========================");

//        printArray(empArray[]);


//        empArray[0] = new Employees("Saha Sob","Enginer", "temp@mail.com", "123456789", "3000", "40");
//       empArray[1] = new Employees("Ivan Ivanov","Enginer", "temp2@mail.com","123456789", "3000", "25");
//        empArray[2] = new Employees("Ivtfut anov","tyutuy", "temp3@mail.com","12787856789", "546456", "41");
//       empArray[3] = new Employees("reret bnn","fgf", "temp@mail.com","788798778578", "3463000", "21");
//        empArray[4] = new Employees("qwerty qwerty","sdfs", "15645657654", "3045600", "45");




    }
 //   public static void printArray (String array[]){
 //       for (int i = 0; i < array.length; i++ ){
 //           System.out.print(array[i] + " ");
 //       }




}

