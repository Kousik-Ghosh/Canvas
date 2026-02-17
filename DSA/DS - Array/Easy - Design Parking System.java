/* https://leetcode.com/problems/design-parking-system/description/ */

class ParkingSystem {

    static int bigCarSlot;
    static int mediumCarSlot;
    static int smallCarSlot;
    public ParkingSystem(int big, int medium, int small) {
        bigCarSlot = big;
        mediumCarSlot = medium;
        smallCarSlot = small;
    }
    
    public boolean addCar(int carType) {
        
        if(carType == 1){
            //big car
            if(bigCarSlot <= 0 ){
                return false;
            }
            bigCarSlot--;

        }else if(carType == 2){
            //medium car
            if(mediumCarSlot <= 0 ){
                return false;
            }
            mediumCarSlot--;
        }else{
            //small car
            if(smallCarSlot <= 0 ){
                return false;
            }
            smallCarSlot--;
        }

        return true;

    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */