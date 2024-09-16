public class Taxi {
    private String taxiId;
    private int taxiNum;
    private String driverName;
    private int numPass;
    private boolean available;

    // קונסטרקטור למחלקה
    public Taxi(String taxiId, int taxiNum, String driverName, int numPass) {
        this.taxiId = taxiId;
        this.taxiNum = taxiNum;
        this.driverName = driverName;
        this.numPass = numPass;
        this.available = true; // התכונה available מאותחלת ל- true
    }

    // פעולות האחזור
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

    // ניתן להוסיף גם פונקציות לשינוי מצב הפניות של המונית אם נדרש
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
}
