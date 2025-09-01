class price{
    int price,quantity,discount,total,bill;
    void getprice(int x,int y){
        price=x;
        quantity=y;

    }
    void gettot(){
        total=price*quantity;
        System.out.println("Total is:"+total);
    }
    void getdis(){
        discount=total*(10/100);
        System.out.println("Discount is"+discount);
    }
    void getbill(){
        bill=total-discount;
        System.out.println("Your discount is:"+bill);
    }
}
class money{
    s=new.price;
    public static void main(String[] a[]) {
        int price,quantity;
        price=Integer.parseInt(a[0]);
        quantity=Integer.parseInt(a[1]);
        s.getprice();
        s.gettot();
        s.getdis();
        s.getbill();
    }
}