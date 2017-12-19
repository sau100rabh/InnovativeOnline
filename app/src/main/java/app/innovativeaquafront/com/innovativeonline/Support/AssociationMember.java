package app.innovativeaquafront.com.innovativeonline.Support;

/**
 * Created by Saurabh Yadav on 23-Sep-16.
 */

public class AssociationMember {

    private String name;
    private String contact;
    private String flat;
    private String post;

    private Vehicle vehicleDetails;

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

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Vehicle getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(Vehicle vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }
}
