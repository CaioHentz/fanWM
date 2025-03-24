import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private String whNum;
    private String whName;
    private Double whCapacity;
    private double whCurrStock;
    private Map<String, Double> stockLog;

    public Warehouse(){
        stockLog = new HashMap<>();
    }

    public String getWhNum() {
        return whNum;
    }

    public void setWhNum(String whNum) {
        this.whNum = whNum;
    }

    public String getWhName() {
        return whName;
    }

    public void setWhName(String whName) {
        this.whName = whName;
    }

    public Double getWhCapacity() {
        return whCapacity;
    }

    public void setWhCapacity(Double whCapacity) {
        this.whCapacity = whCapacity;
    }
    public void addProductStockLog(String id, Double quantity) {
        stockLog.put(id, quantity);
    }

    public void displayStockLog() {
        for (Map.Entry<String, Double> entry : this.stockLog.entrySet()) {
            System.out.println("Id: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }

    public void enterProduct(Product product, double entryQuantity){
        if(this.whCurrStock<this.whCapacity){
            this.whCurrStock += entryQuantity;
            addProductStockLog(product.getIdInt(), entryQuantity);
            System.out.println("=============================");
            System.out.println("New entry:");
            System.out.println("Id: " + product.getIdInt());
            System.out.println("Name: " + product.getNameInt());
            System.out.println("Quantity: " + entryQuantity);
            System.out.println("=============================");

        }
        else{
            System.out.println("Warehouse maximum capacity has been reached!");
        }
    }
}
