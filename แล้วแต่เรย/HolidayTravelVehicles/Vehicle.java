package แล้วแต่เรย.HolidayTravelVehicles;

public class Vehicle {
    public int SerialNumber;
    public String Name;
    public String Model;
    public int Year;
    public String Manufacturer;
    public int BaseCost;

    // constructor
    public Vehicle() {
        this.SerialNumber = SerialNumber;
        this.Name = Name;
        this.Model = Model;
        this.Year = Year;
        this.Manufacturer=Manufacturer;
    }

    public int GetSerialNumber() {
        return this.SerialNumber;
    }

    public String GetName() {
        return this.Name;
    }

    public String GetModel() {
        return this.Model;
    }

    public int GetYear() {
        
        return this.Year;
    }
    public String GetManufacturer() {
        return this.Manufacturer;
    }
    public int GetBaseCost(){
        return this.BaseCost;
    }
     
}
