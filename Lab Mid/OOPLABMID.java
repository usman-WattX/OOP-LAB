//SP25-BCS-076
import java.util.Scanner;

class Equipment{
    protected int equipID;
    protected String brand;
    protected String model;
    protected String type;
    protected double rentPerDay;
    protected boolean isAvailable;

    public Equipment() {
        equipID = 0;
        brand = "";
        model = "";
        type = "";
        rentPerDay = 0.0;
        isAvailable = false;
    }

    public Equipment(int equipID, String brand, String model, String type, double rentPerDay, boolean isAvailable) {
        this.equipID = equipID;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.rentPerDay = rentPerDay;
        this.isAvailable = isAvailable;
    }

    public int getEquipID() {
        return equipID;
    }
    public void setEquipID(int equipID) {
        this.equipID = equipID;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getRentPerDay() {
        return rentPerDay;
    }
    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public double calCost(int days){
        return rentPerDay * days;
    }

    public String toString() {
        return ("Equipment [Brand=" + brand + ", equipID=" + equipID + ", isAvailable=" + isAvailable + ", model="
                + model + ", rentPerDay=" + rentPerDay + ", type=" + type + "]");
    }

}

class Camera extends Equipment{
    private double resolution;
    private String lensType;

    public Camera(){
        resolution = 0.0;
        lensType = "";
    }

    public Camera(int equipID, String brand, String model, String type, double rentPerDay, boolean isAvailable, double resolution, String lensType) {
        super(equipID, brand, model, type, rentPerDay, isAvailable);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public double getResolution() {
        return resolution;
    }
    public void setResolution(double resolution) {
        this.resolution = resolution;
    }
    public String getLensType() {
        return lensType;
    }
    public void setLensType(String lensType) {
        this.lensType = lensType;
    }

    public String toString() {
        return ((super.toString()) + (", Camera [lensType=" + lensType + ", resolution=" + resolution + "]"));
    }

}

class Speaker extends Equipment{
    private double watt;
    private boolean wireless;

    public Speaker() {
        watt = 0.0;
        wireless = true;
    }

    public Speaker(int equipID, String brand, String model, String type, double rentPerDay, boolean isAvailable, double watt, boolean wireless) {
        super(equipID, brand, model, type, rentPerDay, isAvailable);
        this.watt = watt;
        this.wireless = wireless;
    }

    public double getWatt() {
        return watt;
    }
    public void setWatt(double watt) {
        this.watt = watt;
    }
    public boolean isWireless() {
        return wireless;
    }
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public String toString() {
        return ((super.toString()) + (", Speaker [watt=" + watt + ", wireless=" + wireless + "]"));
    }

}

class Client{
    private int clientID;
    private String name;
    private String contact;
    private String organization;

    public Client() {
        clientID = 0;
        name = "";
        contact = "";
        organization = "";
    }

    public Client(int clientID, String name, String contact, String organization) {
        this.clientID = clientID;
        this.name = name;
        this.contact = contact;
        this.organization = organization;
    }

    public int getClientID() {
        return clientID;
    }
    public void setClientID(int clientID) {
        this.clientID = clientID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
   
    public String toString() {
        return "Client [clientID=" + clientID + ", contact=" + contact + ", name=" + name + ", organization="
                + organization + "]";
    }
}

    class Booking{
        private int BookingID;
        private Client client;
        private Equipment equipment;
        private int daysBooked;
        private double totalCost;

        public Booking() {
            BookingID = 0;
            client = new Client();
            equipment = new Equipment();
            daysBooked = 0;
            totalCost = 0.0;
        }

        public Booking(int bookingID, Client client, Equipment equipment, int daysBooked, double totalcost) {
            BookingID = bookingID;
            this.client = client;
            this.equipment = equipment;
            this.daysBooked = daysBooked;
            this.totalCost = totalcost;
        }

        public int getBookingID() {
            return BookingID;
        }
        public void setBookingID(int bookingID) {
            BookingID = bookingID;
        }
        public Client getClient() {
            return client;
        }
        public void setClient(Client client) {
            this.client = client;
        }
        public Equipment getEquipment() {
            return equipment;
        }
        public void setEquipment(Equipment equipment) {
            this.equipment = equipment;
        }
        public int getDaysBooked() {
            return daysBooked;
        }
        public void setDaysBooked(int daysBooked) {
            this.daysBooked = daysBooked;
        }
        public double getTotalCost() {
            return totalCost;
        }
        public void setTotalCost(double totalCost) {
            this.totalCost = totalCost;
        }

        public String toString() {
            return  (equipment.toString()) + ("\n" + client.toString()) + ("\nBooking [BookingID=" + BookingID + ", client=" + client + ", daysBooked=" + daysBooked
                    + ", equipment=" + equipment + ", totalCost=" + totalCost + "]");
        }
        
}
public class OOPLABMID{
    static Scanner in = new Scanner(System.in);
    static Camera[] cameras = new Camera[100];
    static Speaker[] speakers = new Speaker[100];
    static Client[] clients = new Client[100];
    static Booking[] bookings = new Booking[100];
    static int camCount = 0;
    static int speakerCount = 0;
    static int clientCount = 0;
    static int bookingCount = 0;
    public static void main(String[] args) {
        
        boolean exit = false;
        while (!exit) {
            System.out.println("Equipment Rental System");
            System.out.println("1- Add Equipment");
            System.out.println("2- View Equipment");
            System.out.println("3- Search Equipment");
            System.out.println("4- Rent Equipment");
            System.out.println("5- Return Equipment");
            System.out.println("0- Exit");
            System.out.print("Enter Your Choice: ");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    addNewEquipment();
                    System.out.println();
                    break;
                case 2:
                viewEquipments();
                    System.out.println();
                    break;
                case 3:
                searchEquipment();
                    System.out.println();
                    break;
                case 4:
                rentEquipment();
                    System.out.println();
                    break;
                case 5:
                returnEquipment();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("GoodBye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
        
    }
    public static void addNewEquipment(){
        while (true) {
        System.out.println("Which Equipment You want to Add?\n1-Camera\n2-Speaker\n0-Main Menu");
        System.out.print("Enter Your Choice: ");
        int choice = in.nextInt();
        in.nextLine();
        if (choice == 1) {
            if(camCount == cameras.length){
                System.out.println("All Camera Slots are Filled!");
            }else{
            System.out.print("Enter Brand: ");
            String Brand = in.nextLine();
            System.out.print("Enter Model: ");
            String model = in.nextLine();
            System.out.print("Enter Type: ");
            String type = in.nextLine();
            System.out.print("Enter Rent/Day: ");
            double rentPerDay = in.nextDouble();
            in.nextLine();
            System.out.print("Availability Status(true/false): ");
            boolean Availability = in.nextBoolean();
            in.nextLine();
            System.out.print("Enter the Resolution:");
            Double resolution = in.nextDouble();
            in.nextLine();
            System.out.print("Enter Lens Type:");
            String lensType = in.nextLine();

            cameras[camCount] = new Camera(camCount, Brand, model, type, rentPerDay, Availability, resolution, lensType);
            camCount++;
            System.out.println("Camera Successfully Added!");  
            } 
        }else if(choice == 2){
            if(speakerCount == speakers.length){
                System.out.println("All Speakers Slots are Filled!");
            }else{
                System.out.print("Enter Brand: ");
                String Brand = in.nextLine();
                System.out.print("Enter Model: ");
                String model = in.nextLine();
                System.out.print("Enter Type: ");
                String type = in.nextLine();
                System.out.print("Enter Rent/Day: ");
                double rentPerDay = in.nextDouble();
                in.nextLine();
                System.out.print("Availability Status(true/false): ");
                boolean Availability = in.nextBoolean();
                in.nextLine();
                System.out.print("Enter Wattage:");
                Double watt = in.nextDouble();
                in.nextLine();
                System.out.print("Is it Wireless?");
                boolean wireless = in.nextBoolean();

                speakers[speakerCount] = new Speaker(speakerCount, Brand, model, type, rentPerDay, Availability, watt, wireless);
                speakerCount++;
                System.out.println("Speaker Successfully Added!");
            }
        }else if (choice == 0) {
                System.out.println("Returning to Main!");
                return;
        }else{
                System.out.println("Invalid!");
                break;
            }
        }
    }
    public static void viewEquipments(){
        System.out.println("Equipment List: ");
        System.out.println("Cameras:");
        if(camCount == 0){
            System.out.println("No Cameras Available!");
        }else{
            for(int i = 0; i < camCount; i++){
                 if(cameras[i] != null){
                    System.out.println(cameras[i]);
                 }
            }
        }
        
        System.out.println("Speakers:");
        if(speakerCount == 0){
            System.out.println("No Speakers Available!");
        }else{
            for(int i = 0; i < speakerCount; i++){
            if(speakers[i] != null){
                    System.out.println(speakers[i]);
                 }
            }
        }
        return;
    }
    public static void searchEquipment(){
        while (true) {
        System.out.println("Which Equipment You want to Search?\n1-Camera\n2-Speaker\n0-Main Menu");
        System.out.print("Enter Your Choice: ");
        int choice = in.nextInt();
        in.nextLine();
        if (choice == 1) {
            boolean camFound = false;
            System.out.print("Enter Camera ID:");
            int camid = in.nextInt();
            in.nextLine();
            for(int i = 0; i < camCount; i++){
                if (cameras[i] != null && cameras[i].getEquipID() == camid) {
                    System.out.println("Camera Found!");
                    System.out.println(cameras[i]);
                    camFound = true;
                }
           }
           if (!camFound) {
            System.out.println("Camera Not found!");
            break;
           }
        }else if(choice == 2){
            boolean speakerFound = false;
            System.out.print("Enter Speaker ID:");
            int speakerid = in.nextInt();
            in.nextLine();
            for(int i = 0; i < speakerCount; i++){
                if (speakers[i] != null && speakers[i].getEquipID() == speakerid) {
                        System.out.println("Speaker Found!");
                        System.out.println(speakers[i]);
                        speakerFound = true;
                }
            }
            if (!speakerFound) {
             System.out.println("Speaker Not found!");
             break;
           }
        }else if (choice == 0) {
                System.out.println("Returning to Main!");
                return;
        }else{
                System.out.println("Invalid!");
                break;
            }
        }
    }
    public static void rentEquipment() {
    while (true) {
        System.out.println("Which Equipment You want to Rent?\n1-Camera\n2-Speaker\n0-Main Menu");
        System.out.print("Enter Your Choice: ");
        int choice = in.nextInt();
        in.nextLine();

        System.out.print("Enter Client Name: ");
        String name = in.nextLine();
        System.out.print("Enter Contact: ");
        String contact = in.nextLine();
        System.out.print("Enter Organization Name: ");
        String organization = in.nextLine();

        clients[clientCount] = new Client(clientCount, name, contact, organization);
        clientCount++;

        int bookingIndex = -1;
        for (int i = 0; i < bookings.length; i++) {
            if (bookings[i] == null) {
                bookingIndex = i;
                break;
            }
        }
        if (bookingIndex == -1) {
            System.out.println("Booking storage is full!");
            return;
        }
        if (choice == 1) {
            System.out.print("Enter Camera ID: ");
            int camID = in.nextInt();
            in.nextLine();
            if (camID < 0 || camID >= camCount || cameras[camID] == null || !cameras[camID].isAvailable()) {
                System.out.println("Invalid or Unavailable Camera ID!");
                break;
            }
            System.out.print("For How many Days? ");
            int days = in.nextInt();
            in.nextLine();

            cameras[camID].setAvailable(false);
            bookings[bookingIndex] = new Booking(bookingIndex, clients[clientCount - 1], cameras[camID], days, cameras[camID].calCost(days));

            System.out.println("Booking Done!");
            System.out.println(bookings[bookingIndex]);
            bookingCount++;
        } 
        else if (choice == 2) {
            System.out.print("Enter Speaker ID: ");
            int speakerID = in.nextInt();
            in.nextLine();
            if (speakerID < 0 || speakerID >= speakerCount || speakers[speakerID] == null || !speakers[speakerID].isAvailable()) {
                System.out.println("Invalid or Unavailable Speaker ID!");
                break;
            }
            System.out.print("For How many Days? ");
            int days = in.nextInt();
            in.nextLine();
            speakers[speakerID].setAvailable(false);
            bookings[bookingIndex] = new Booking(bookingIndex, clients[clientCount - 1], speakers[speakerID], days, speakers[speakerID].calCost(days));
            System.out.println("Booking Done!");
            System.out.println(bookings[bookingIndex]);
            bookingCount++;
        } 
        else if (choice == 0) {
            System.out.println("Returning to Main!");
            return;
        } 
        else {
            System.out.println("Invalid!");
            break;
        }
    }
}
    public static void returnEquipment(){
        while (true) {
            boolean found = false;
            System.out.print("Enter Your Booking ID: ");
            int bookingID = in.nextInt ();
            in.nextLine();
            for(int i = 0; i < bookingCount; i++){
                if (bookings[i] != null && bookings[i].getBookingID() == bookingID) {
                     if(bookings[i].getEquipment() != null) {
                        bookings[i].getEquipment().setAvailable(true);
                    }
                    bookings[i] = null;
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Booking Not Found!");
                break;
            }else{
                System.out.println("Equipmet Has Been Returned!");
            }
            return;
        }
    }
}