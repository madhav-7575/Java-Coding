class price{
    int p,quantity,discount,total,bill;
    void getprice(int x,int y){
        p=x;
        quantity=y;

    }
    void gettot(){
        total=p*quantity;
        System.out.println("Total is:"+total);
    }
    void getdis(){
        discount=total*10/100;
        System.out.println("Discount is"+discount);
    }
    void getbill(){
        bill=total-discount;
        System.out.println("Your discount is:"+bill);
    }
}
class money{
      
    public static void main(String a[]) {
        price s=new price();
        s.getprice( 100,7);
        s.gettot();
        s.getdis();
        s.getbill();
    }
}