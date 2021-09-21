 public class Main {

    //Main method
     public static void main(String[] args) {
         //Instantiating animal objects with parameters
         Animal rabbit = new Animal("Rabbit", 1, 1);
         Animal snake = new Animal("Snake", 10, 10);

         //While loop with hard coded true statement
         boolean loop = true;
         while (loop) {

             //Calling move animal method on rabbit object
             rabbit.moveAnimal();
             System.out.println(rabbit);
             //If statement with a condition until the difference btw two objects are 0
             if (snake.getX() - rabbit.getX() != 0) {
                 snake.moveAnimal();
                 System.out.println(snake);
             }
             //Else statement with print out and stop statement(loop changes to false when condition met) for quitting while loop
             else {
                 System.out.println("Hahaa! I, the snake, will now eat you!!");
                 loop = false;

             }
             //If statement for print out of snake obj. warning rabbit obj. at position distance 1
             if ((snake.getX() == rabbit.getX() + 1 || snake.getX() == rabbit.getX() - 1) &&
                     (snake.getY() == rabbit.getY() + 1 || snake.getY() == rabbit.getY() - 1)) {
                 System.out.println("I am VERY close and I am going to GET you!!!!!!! ");
             }
         }
 }
}