interface recorder {
    void record(String pname,String iname,float volume,String status);
}
 class Wallet implements recorder{
    private float balance;
    private String belong;

    @Override
    public void record(String pname,String iname,float volume,String status) {
        order nor = new order(pname, iname, volume, status);
    }
    public Wallet(float balance,String belong) {
        this.balance = balance;
        this.belong = belong;
    }
    public void pay(boolean flag,float payment) {
         if(flag){
          balance = balance - payment;
         }else {
             System.out.println("支付失败");
         }
    }
    public void income(boolean flag,float income) {
        if(flag){
            balance = balance + income);
        }else {
            System.out.println("收款失败");
        }
    }
    public float getBalance() {
        return balance; }
    public void setBalance(float balance) {
        this.balance = balance; }
    public String getBelong() {
        return belong; }
    public void setBelong(String belong) {
        this.belong = belong; }
}
class order {
    private String pname;
    private String iname;
    private float volume;
    private String status;

    order(String pname, String iname, float volume, String status) {
        this.pname = pname;
        this.iname = iname;
        this.volume = volume;
        this.status = status;
    }
    public void printorder(){
        System.out.println("支付方"+pname);
        System.out.println("收款方"+iname);
        System.out.println("支付金额"+volume);
        System.out.println("支付状态"+status);
    }
}
class Transaction implements recorder {
    private boolean flag = false;
    Customer co;
    Retailer re;
    public Transaction(Customer co,Retailer re) {
        this.co = co;
        this.re = re;
    }
    @Override
    public void record(String pname, String iname, float volume, String status) {
        order nor = new order(pname, iname, volume, status);
    }
    public void paycheck() {
        co.Cwallet.getBalance()= re.Rwallet.getBalance();
        flag = true;
    }
}
class Retailer{
    private String name;
    private String addr;
    private String phone;

    Retailer(String name, String addr, String phone) {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }
    public String getName() {
        return name; }
    public String getAddr() {
        return addr; }
    public String getPhone() {
        return phone; }
        class Rwallet extends Wallet {
            public Rwallet(float balance) {
                super(balance,name);
            }
        }

}
class Customer {
    private String name;
    private String title;

    Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getTitle() {
        return title; }
    public void setTitle(String title) {
        this.title = title; }
        class Cwallet extends Wallet  {

            public Cwallet(float balance) {
                super(balance, name);
            }
        }
}

class Goods {
    private String name;
    private double price;
    private int amount;
    private int saleamount;

    public double getPrice() {
        return price; }
    public void setPrice(double price) {
        this.price = price; }
    public int getAmount() {
        return amount; }
    public void setAmount(int amount) {
        this.amount = amount; }
    public int getSaleamount() {
        return saleamount; }
    public void setSaleamount(int saleamount) {
        this.saleamount = saleamount; }
    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name; }
}
class Clothes extends Goods {
    private String style;
    private String size;
    private String brand;

    public String getStyle() {
        return style; }
    public void setStyle(String style) {
        this.style = style; }
    public String getSize() {
        return size; }
    public void setSize(String size) {
        this.size = size; }
    public String getBrand() {
        return brand; }
    public void setBrand(String brand) {
        this.brand = brand; }
}
class Books extends Goods {
    private String press;
    private String writer;

    public String getPress() {
        return press; }
    public void setPress(String press) {
        this.press = press; }
    public String getWriter() {
        return writer; }
    public void setWriter(String writer) {
        this.writer = writer; }
}
public class Shopping {
    public static void main(String args[]) {
        
    }
}
