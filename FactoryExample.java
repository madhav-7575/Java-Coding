class Factory{
    public void needs(){

    }
}
//subclass1
class shoefactory extends Factory{
    public void needs(){
        System.out.println("shoes are manufactured");

    }
}
//subclass2
class chemicalfactory extends Factory{
    public void needs(){
        System.out.println("chemicals are manufactured");
    }
}
//subclass3
class steelfactory extends Factory{
    public void needs(){
        System.out.println("Steels are manufactured");
    }
}
public class FactoryExample{
    public static void main (String[] args){
        Factory factory1=new shoefactory();
        Factory factory2=new chemicalfactory();
        Factory factory3=new steelfactory();
        factory1.needs();
        factory2.needs();
        factory3.needs();
    }
}