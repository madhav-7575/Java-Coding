class college{
    protected String name;
    protected String place;
    public college(String name,String place){
        this.name=name;
        this.place=place;
        
    }
    public void displaydetails(){
        System.out.println("Name of the college: " +name);
        System.out.println("college Location: " +place);
    }
}
class Tier1 extends college{
    private int code;
    public Tier1(String name,String place,int code){
        super(name,place);
        this.code=code;


    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("COllege code is: " +code);
    }

}
public class Study{
    public static void main(String[] args) {
        Tier1 tier1=new Tier1("Saranathan","Panjappur",635478);
        System.out.println("Details of tier1 college");
        tier1.displaydetails();
      
        
    }
}