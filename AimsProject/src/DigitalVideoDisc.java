public class DigitalVideoDisc {
    // Khai báo thuộc tính
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Xây dựng phuơng thức
    //Các phương thức getter và setter
    public String getTitle(){
        return this.title;
    }

    public void setTiltle(String title){
        this.title = title;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getDirector(){
        return this.director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public int getLength(){
        return this.length;
    }

    public void setLength(int length){
        if (length > 0) {
            this.length = length;
        }
        else this.length = 0;

    }

    public float getCost(){
        return this.cost;
    }

    public void setCost(float cost){
        if (cost > 0) {
            this.cost = cost;
        }
        else this.cost = 0.0f;
    }

    //Các phương thức khởi tạo
    //Đặc điểm của constructor: 
    //++ tên trùng với tên lớp
    //++ không có kiểu trả về, không có void
    //++ xây dựng nhiều constructor giúp khởi tạo
    //++ đối tượng từ lớp theo nhiều cách khác nhau

    //1. Constructor không tham số
    public DigitalVideoDisc(){ //gán giá trị mặc định cho các thuộc tính
        this.title = "";
        this.category = "";
        this.director = "";
        this.length = 0;
        this.cost = 0.0f;
    }

    //2.Constructor có 1 tham số
    public DigitalVideoDisc(String title)
    {
        this.title = title;
    }

    //3.Constructor có 2 tham số
    public DigitalVideoDisc(String title, String category){
        this.title = title;
        this.category = category;
    }

    //4.Constructor có 3, 4, 5, ... tham số
    public DigitalVideoDisc(String title, String category, String director){
        this.title = title;
        this.category = category;
        this.director = director;
    }

    //5.Constructor với tất cả các tham số
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    //Các phương thức khác
    //Phương thức in thông in của đối tượng DVD
    public void printInfo(){
        System.out.println("------------DVD Info------------");
        System.out.println("Title: " + this.title);
        System.out.println("Category: " + this.category);
        System.out.println("Director: " + this.director);
        System.out.println("Length: " + this.length);
        System.out.println("Cost: " + this.cost);
    }
}
