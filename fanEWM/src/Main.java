public class Main {
    public static void main(String[] args) {

        Product prod1;
        prod1 = new Product();

        prod1.setIdInt("CC001");
        prod1.setNameInt("LP MBDTF - Kanye West (2009)");
        prod1.setUomInt("EA");

        //prod1.printData();

        Warehouse wh01;
        wh01 = new Warehouse();

        wh01.setWhNum("WH01");
        wh01.setWhName("LA WH");
        wh01.setWhCapacity(1000.00);

        wh01.enterProduct(prod1, 100);

        wh01.displayStockLog();



    }
}