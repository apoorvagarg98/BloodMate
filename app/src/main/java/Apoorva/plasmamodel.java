package Apoorva;

public class plasmamodel {
    String name,phone,availability,add,gender,pic,allergy,disease,op,pickup,grp,pincode;
    public plasmamodel()
    {

    }



    public plasmamodel(String name, String phone, String grp, String add, String gender, String pic, String allergy, String disease, String op, String availability,String pickup,String pincode) {
        this.grp=grp;
        this.name = name;
        this.phone = phone;
        this.availability = availability;
        this.add = add;
        this.gender=gender;
        this.pic=pic;
        this.allergy=allergy;
        this.disease=disease;

        this.op=op;
        this.pincode=pincode;
        this.pickup=pickup;

    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setOp(String op) {
        this.op = op;
    }


    public String getPincode() {
        return pincode;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getPickup() {
        return pickup;
    }

    public String getName() {
        return name;
    }

    public String getPhonenum() {
        return phone;
    }

    public String getAvailability() {
        return availability;
    }

    public String getCity() {
        return add;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonenum(String phonenum) {
        this.phone = phonenum;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setCity(String city) {
        this.add = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPic() {
        return pic;
    }

    public String getAllergy() {
        return allergy;
    }

    public String getDisease() {
        return disease;
    }

    public String getOp() {
        return op;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getGrp() {
        return grp;
    }

    public void setBgrp(String bgrp) {
        this.grp = bgrp;
    }
}
