public class Animal {

    // instance fields or variables set private for encapsulation
    private String snake;
    private String rabbit;
    private String type;
    private int x;
    private  int y;

    // constructor method with arguments
    public Animal(String type, int x, int y) {
        // assign parameter value to instance field
        this.type = type;
        this.x = x;
        this.y = y;}

    // getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // method for moving animal objects with one position at a time
    public void moveAnimal(){
        if (getType().equals("Rabbit")) {
            setX(getX()+1);
            setY(getY()+1);
        }
        else {
            setX(getX()-1);
            setY(getY()-1);
        }

    }

    // creating custom toString method with 'override'-ing JAVA default method
    @Override
    public String toString() {
        return "I am the " + type +
                " and I'm now standing on square " + x + "," + y;
    }
}