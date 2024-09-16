import java.util.ArrayList;
import java.util.List;

public class TaxiStation {
    // רשימת המוניות בתחנה
    private Taxi[] taxis;
   private int c;
private String stationName;



    // קונסטרקטור למחלקה
    public TaxiStation(String stationName) {
        this.stationName=stationName;
        this.taxis = new Taxi[80];
         this.c=0;

    }

    // הוספת מונית לתחנה
    public void addTaxi(String taxiId, String driverName, Integer numPass) {
        this.taxis[c].addiTaxi(taxiId,driverName,numPass);
        c++;
    }

    // קבלת מונית לפי מספרה
    public Taxi getTaxiByNum(Integer taxiNum) {
        for (Taxi taxi : taxis) {
            if (taxi.GetNum() == taxiNum) {
                return taxi;
            }
        }
        return null; // אם המונית לא נמצאה
    }

    // קבלת רשימה של כל המוניות בתחנה

    public  int taxiTnum(){
        return this.c;
    }
    public int find(int n)
    {
        for (int i = 0; i < this.c; i++)
        {

                if (taxis[i].GetNumPass() >= n && taxis[i].IsAvailable() )
                {
                    taxis[i].setNotAvailable(taxis[i].IsAvailable());
                    return taxis[i].GetNum();
                }



            }

        return -1;
    }
}