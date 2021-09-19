public class Animal {
    private String snake;
    private String rabbit;
    private String name;
    private int x;
    private  int y;


    public Animal(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void moveAnimal(){
        if (getName().equals("Rabbit")) {
            setX(getX()+1);
            setY(getY()+1);
        }
        else {
            setX(getX()-1);
            setY(getY()-1);
        }

    }

    @Override
    public String toString() {
        return "I am the " + name +
                " and I'm now standing " + x + "," + y;
    }
}