 // a program that deals with points.


 public class Main {

     public static void main(String[] args) {
         // create two Point objects
        /* Point p1 = new Point(1, 1);
         Point p2 = new Point(10, 10);
*/

         Animal rabbit = new Animal("Rabbit", 1, 1);
         Animal snake = new Animal("Snake", 10, 10);


         boolean loop = true;

         while (loop) {

             //move animal
             rabbit.moveAnimal();
             System.out.println(rabbit);

             if (snake.getX() - rabbit.getX() != 0) {
                 snake.moveAnimal();
                 System.out.println(snake);

             }  else {
                 //If true and loop
                 System.out.println("Hahaa! I the snake will now eat you!");
                 loop = false;
             }
             if ((snake.getX() == rabbit.getX() + 1 || snake.getX() == rabbit.getX() - 1) &&
                     (snake.getY() == rabbit.getY() + 1 || snake.getY() == rabbit.getY() - 1)) {
                 System.out.println("I am going VERY close and I am going to GET you!!!!!!! ");
             }
         }
/*
        System.out.println("I am rabbit, and I am now standing on square " + p1);
        System.out.println("I am the snake, and I am now standing on square " + p2);

        //translate each point to a new location
        p1.translate(1, 2);
        p2.translate(-1, 0);

        System.out.println(("The rabbit moves to ") + p1);
        System.out.println(("the snake moves to ") + p2);

        //new translate points
        p1.translate(1, 0);
        p2.translate(0, -1);

        System.out.println(("The rabbit moves to") + p1);
        System.out.println(("The snake moves to") + p2);

        //new translate methods (there is probably a better way than this, haha)
        p1.translate(0, 1);
        p2.translate(-1, -1);


        System.out.println(("The rabbit moves to ") + p1 + "\n" + ("The snake moves to ") + p2);
   */
 }
}



