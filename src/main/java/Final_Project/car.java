package Final_Project;

public class car {

    string brand;
    string model;
    string type;
    boolean availability;
    float price;
    string reservation;

    public car(string brand, string model, string plate, srting type, boolean availability, float price, string reservation){
        this.brand=brand;
        this.model=model;
        this.plate=type;
        this.availability=availability;
        this.price=price;
        this.reservation=reservation;
    }

    public string getBrand() {
        return brand;
    }

    public string getModel() {
        return model;
    }

    public string getType() {
        return type;
    }

    public boolean isAvailability() {
        return availability;
    }

    public float getPrice() {
        return price;
    }

    public string getReservation() {
        return reservation;
    }

}
