public class Main {

    public static void main(String[] args) {
      // Завдання 1.
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double s = Math.pow(a, 2) + b * b;
        System.out.println("Hypotenuse is " + s);
    
  

      //Завдання 2.
       int a = keyboard.nextInt();
       int b = a + 1;
       int c = a - 1;

       System.out.println("The next number " + a + " is " + b);
       System.out.println("The previous number " + a + " is " + c);
  



      //Завдання 3.4.
        int n = keyboard.nextInt();
        int k = keyboard.nextInt();

        int stud = k / n;
        int apps = k % n;

        System.out.println(stud);
        System.out.println(apps);

                   
    }


}