import java.util.ArrayList;
import java.util.List;

public class TaxiStation {
    // רשימת המוניות בתחנה
    private List<Taxi> taxis;

    // קונסטרקטור למחלקה
    public TaxiStation() {
        this.taxis = new ArrayList<>();
    }

    // הוספת מונית לתחנה
    public void addTaxi(String taxiId, String driverName, int numPass) {
        int taxiNum = taxis.size() + 1; // הגדרת מספר המונית החדש
        Taxi newTaxi = new Taxi(taxiId, taxiNum, driverName, numPass);
        taxis.add(newTaxi);
    }

    // קבלת מונית לפי מספרה
    public Taxi getTaxiByNum(int taxiNum) {
        for (Taxi taxi : taxis) {
            if (taxi.GetNum() == taxiNum) {
                return taxi;
            }
        }
        return null; // אם המונית לא נמצאה
    }

    // קבלת רשימה של כל המוניות בתחנה
    public List<Taxi> getAllTaxis() {
        return new ArrayList<>(taxis);
    }
}
    public void AddTaxi(String driverName, String taxiId, int numPass) {
        this.driverName = driverName;
        this.taxiId = taxiId;
        this.numPass = numPass;
    }
    public void TaxiBusy(){
    this.t
    }
