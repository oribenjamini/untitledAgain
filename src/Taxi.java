public class Taxi {
    private String taxiId;
    private Integer taxiNum;
    private String driverName;
    private Integer numPass;
    private Boolean available;

    public Taxi(String taxiId, Integer taxiNum, String driverName, Integer numPass) {
        this.taxiId = taxiId;
        this.taxiNum = taxiNum;
        this.driverName = driverName;
        this.numPass = numPass;
        this.available = true; // Default to true
    }

    // Getter methods
    public String GetId() {
        return taxiId;
    }

    public int GetNum() {
        return taxiNum;
    }

    public String GetName() {
        return driverName;
    }

    public int GetNumPass() {
        return numPass;
    }

    public boolean IsAvailable() {
        return available;
    }

    public void addiTaxi(String driverName, String taxiId, Integer numPass) {
        this.driverName = driverName;
        this.taxiId = taxiId;
        this.numPass = numPass;
    }

    // Setter method for availability
    public void setNotAvailable(Boolean available) {
        this.available = false;
    }
}