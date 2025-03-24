public class Product {
    private String idInt;
    private String nameInt;
    private String uomInt;

    public String getUomInt() {
        return uomInt;
    }

    public void setUomInt(String uomInt) {
        this.uomInt = uomInt;
    }

    public String getIdInt() {
        return idInt;
    }

    public void setIdInt(String idInt) {
        this.idInt = idInt;
    }

    public String getNameInt() {
        return nameInt;
    }

    public void setNameInt(String nameInt) {
        this.nameInt = nameInt;
    }

    public void printData() {
        System.out.println("==================================");
        System.out.println("Id:    " + getIdInt());
        System.out.println("Name:  " + getNameInt());
        System.out.println("UoM:   " + getUomInt());
        System.out.println("==================================");
    }
}
