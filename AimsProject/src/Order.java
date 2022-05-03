public class Order {
    //Khai bao 1 hằng số: số lượng sản phẩm tối đa cho đơn hàng
    public static final int MAX_NUMBER_ORDERED = 10;
    //Khai báo 1 mảng các đối tượng DVD
    private DigitalVideoDisc itemOrdered[] = 
    new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    //Khai báo thuộc tính chứa số lượng sản phẩm hiện có trong đơn hàng
    private int qtyOrdered = 0;

    //Xây dựng các phương thức
    //Các phương thức getter setter

    public int getQtyOrdered(){
        return this.qtyOrdered;
    }

    private MyDate dateOrder;
    public static final int MAX_LIMITED_ORDERED = 5;
    private static int nbOrder = 0;

    public Order() {
        if (this.nbOrder == MAX_LIMITED_ORDERED) {
            System.out.println("Over number of order!");
        }
        else{
            this.qtyOrdered = 0;
            this.dateOrder = new MyDate(); //măc định là ngày hiện tại
            nbOrder++; //có thêm đối tượng đã được tạo ra
        }
    }

    public void setQtyOrdered(int qtyOrdered){
        if (qtyOrdered >= 0) {
            this.qtyOrdered = qtyOrdered;
        }
    }

    //Phương thức thêm một đối tượng DVD vào đơn hàng
    //Chính là thêm một đối tượn tượng DVD vào mảng
    //==> phải kiểm tra xem mảng đã bị đầy chưa
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (this.qtyOrdered == MAX_NUMBER_ORDERED) {
            System.out.println("The order is almost full");
        }
        else{
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Order successed");
        }
    }

    //Method overloading
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        if (this.qtyOrdered == MAX_NUMBER_ORDERED || this.qtyOrdered + dvdList.length > MAX_NUMBER_ORDERED) {
            System.out.println("The order is almost full");
        }
        else{
            for(int i = 0; i < dvdList.length; i++){
                this.addDigitalVideoDisc(dvdList[i]);
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        DigitalVideoDisc[] discOrderTemp = new DigitalVideoDisc[MAX_NUMBER_ORDERED] ;
        int index = 0;
        int count = 0;
        if (this.qtyOrdered == 0) {
            System.out.println("Nothing in your order list");
        }
        else{
            for(int i = 0; i < qtyOrdered; i++){
                if (itemOrdered[i] == disc) {
                    index = i;
                    count++;
                    break;                
                }
            }
            if (count == 0) {
                System.out.println("Haven't any item that you want to delete in your order list");
            }
            else{
                qtyOrdered = qtyOrdered-1;
                for(int i = index; i < qtyOrdered; i++){
                    itemOrdered[i] = itemOrdered[i+1];
                }
                System.out.println("Delete successed");
            }
        }
    }

    public float totalCost(){
        float total = 0.0f;
        for(int i = 0; i < this.qtyOrdered; i++)
        {
            total += itemOrdered[i].getCost();
        }
        return total;
    }

    //Phương thức in đơn hàng
    public void printListOrder(){
        System.out.println("***********************Order***********************");
        System.out.print("Date: ");
        this.dateOrder.printDate();
        System.out.println("Ordered Items:");
        System.out.println("\t Title \t \t Category \t Director \t Length\t   Price");
        for(int i = 0; i < this.qtyOrdered; i++){
            System.out.println((i+1) + ". DVD - " + itemOrdered[i].getTitle() + "\t"
            + itemOrdered[i].getCategory() + "\t"
            + itemOrdered[i].getDirector() + "\t"
            + itemOrdered[i].getLength() + " min \t"
            + " : " + itemOrdered[i].getCost() + "$");
        }

        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }
}
