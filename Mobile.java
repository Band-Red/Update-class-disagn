public class Mobile {
    String brand;
    String color;
    int pixcl;
public Mobile(String brand, String color, int pixcl){
    this.brand = brand;
    this.color = color;
    this.pixcl = pixcl;   
}
public void updatepixcl(int pixcl){
    this.pixcl = pixcl;
}
@Override
public String toString(){
    return (this.brand+":"+this.color+":"+this.pixcl);
}
}