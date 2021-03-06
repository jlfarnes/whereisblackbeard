/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

//import java.io.Serializable;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author josephclark
 */
public enum Market implements Serializable {
    
    Diplomats_Bag("A handy bag with a big, fat padlock to keep prying eyes out."),
    Pirates_Hat("Yarr! It looks exactly like what you think..."),
    Dead_Parrot("He's not dead, he's just sleeping");
    
    private String foodForSale;
    private String waterForSale;
    private String clothForSale;
    private String accessories;

//    public Market() {
//    }
    
    Market(String xForSale) {
        this.foodForSale = xForSale;
        this.waterForSale = xForSale;
        this.clothForSale = xForSale;
    }

    public String getFoodForSale() {
        return foodForSale;
    }

//    public void setFoodForSale(String foodForSale) {
//        this.foodForSale = foodForSale;
//    }

    public String getWaterForSale() {
        return waterForSale;
    }

//    public void setWaterForSale(String waterForSale) {
//        this.waterForSale = waterForSale;
//    }

    public String getClothForSale() {
        return clothForSale;
    }

//    public void setClothForSale(String clothForSale) {
//        this.clothForSale = clothForSale;
//    }

//    public String getAccessories() {
//        return accessories;
//    }

//    public void setAccessories(String accessories) {
//        this.accessories = accessories;
//    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 53 * hash + Objects.hashCode(this.foodForSale);
//        hash = 53 * hash + Objects.hashCode(this.waterForSale);
//        hash = 53 * hash + Objects.hashCode(this.clothForSale);
//        hash = 53 * hash + Objects.hashCode(this.accessories);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Market other = (Market) obj;
//        if (!Objects.equals(this.foodForSale, other.foodForSale)) {
//            return false;
//        }
//        if (!Objects.equals(this.waterForSale, other.waterForSale)) {
//            return false;
//        }
//        if (!Objects.equals(this.clothForSale, other.clothForSale)) {
//            return false;
//        }
//        if (!Objects.equals(this.accessories, other.accessories)) {
//            return false;
//        }
//        return true;
//    }

    
    
    @Override
    public String toString() {
        return "Market{" + "foodForSale=" + foodForSale + ", waterForSale=" + waterForSale + ", clothForSale=" + clothForSale + ", accessories=" + accessories + '}';
    }
      
}
