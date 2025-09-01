class Cricket{
    String name;
    String owner;
    int nos;
    public Cricket(String name,String owner,int nos){
        this.name=name;
        this.owner=owner;
        this.nos=nos;

    }
    public void displayinfo(){
        System.out.println("Name of the team:"+name);
        System.out.println("Owner of the team:"+owner);
        System.out.println("No of trophies:"+nos);
    }


}
public class team{
    public static void main(String[] args) {
        Cricket cricket1=new Cricket("CSK","Kasi vishavanath",5);
        Cricket cricket2=new Cricket("MI","Ambani family",5);
        System.out.println("Information of cricket 1");
        cricket1.displayinfo();
        System.out.println("\nInformation of cricket 2");
        cricket2.displayinfo();

        
    }
}
