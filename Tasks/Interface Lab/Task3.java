interface Compare{
    public boolean compareObjects(Object obj);
}

class InventoryItem implements Compare{
    private String name;
    private int uniqueID;

    public InventoryItem() {
        name = "";
        uniqueID = 0;
    }

    public InventoryItem(String name, int uniqueID) {
        this.name = name;
        this.uniqueID = uniqueID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getUniqueID() {
        return uniqueID;
    }
    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public boolean compareObjects(Object obj){
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof InventoryItem)) {
            return false;
        }

        InventoryItem ii = (InventoryItem) obj;

        if (this.uniqueID == ii.uniqueID) {
            return true;
        }else{
            return false;
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        
        InventoryItem item1 = new InventoryItem("DD", 3);
        InventoryItem item2 = new InventoryItem("JJ",2);
        InventoryItem item3 = new InventoryItem("LL", 1);
        
        System.out.println(item1.compareObjects(item2));
        System.out.println(item2.compareObjects(item3));
    }
}
