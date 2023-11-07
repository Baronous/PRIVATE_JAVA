package Private_Buoi3;
import java.util.Scanner;
public class Baitap1 {
        private String id;//id
        private String name;//ten loai rau cu
        private String unit;//don vi tinh (kg, bo, ....)
        private int quantitySold;//so luong da ban
        private int sale;//phan tram giam gia(%)
        private Double price;//gia goc
        //CONSTRUCTOR
        public Baitap1(){

        }
        public Baitap1(String id, String name, String unit, int quantitySold, int sale, Double price){
            this.id = id;
            this.name = name;
            this.unit = unit;
            this.quantitySold = quantitySold;
            this.sale = sale;
            this.price = price;
        }
        // GETTERs
        public String getId(){
            return id;
        }

        public String getName(){
            return name;
        }

        public String getUnit(){
            return unit;
        }

        public int getQuantitySold(){
            return quantitySold;
        }

        public int getSale(){
            return sale;
        }

        public Double getPrice(){
            return price;
        }

        //SETTERS
        public void setId(String id2){
            this.id = id2;
        }

        public void setName(String name2){
            this.name  = name2;
        }

        public void setUnit(String unit2){
            this.unit = unit2;
        }

        public void setQuantitySold(int quantitySold2){
            this.quantitySold = quantitySold2;
        }

        public void setSale(int sale2){
            this.sale = sale2;
        }

        public void setPrice(Double price2){
            this.price = price2;
        }

        public Double getTotalRevenue(){
            return quantitySold * price * (1 - sale/100.0);
        }
        public void display() {
            System.out.printf("%-10s%-20s%-10s%-15s%-10s%-10s%-15s\n", id, name, unit, quantitySold, sale + "%", price, getTotalRevenue());
        }

}
