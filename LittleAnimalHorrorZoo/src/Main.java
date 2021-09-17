 // a program that deals with points.
// (fourth version, to accompany encapsulated Point class)



 public class Main {

    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(1, 1);
        Point p2 = new Point(10, 10);


        System.out.println("Rabbit starting point is: " + p1);
        System.out.println("Snake starting point is " + p2);

        //translate each point to a new location
        p1.translate(0, 1);
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
    }

}



