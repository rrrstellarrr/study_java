package java_class.enum_class.EnumEx02;

public enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");

    private String color;

    Fruit(String color){
        System.out.println("Call Constructor " + this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}
