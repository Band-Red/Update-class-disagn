public class A{
    public static void main(String[] args) {
    Mobile A1=new Mobile("Iphone","Gold",8);
    Mobile A2=new Mobile("Samsung","White",13);
    Mobile A3=new Mobile("Nexus","Black",8);
    System.out.println(A1.toString());
    A1.updatepixcl(12);
    System.out.println(A1.toString());
    System.out.println(A2.toString());
    System.out.println(A3.toString());
}
}