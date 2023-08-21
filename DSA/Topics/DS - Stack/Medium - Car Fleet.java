/* https://leetcode.com/problems/car-fleet/description/ */

class Car{

    int distanceFromTarget;
    int speed;
    double timeToTarget;

    Car(int dft, int s){
        distanceFromTarget = dft;
        speed = s;
        timeToTarget = (double) distanceFromTarget/speed;
    }

}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        ArrayList<Car> cars = new ArrayList<>();
        for(int i = 0; i < position.length; i++){
            cars.add(new Car(target-position[i], speed[i]));
        }

        cars.sort((c1, c2)->{ return c1.distanceFromTarget - c2.distanceFromTarget; });

        ArrayDeque<Car> fleet = new ArrayDeque<>();
        for(int i = cars.size()-1; i >= 0; i--){
            if(fleet.isEmpty()){
                fleet.push(cars.get(i));
            }else{
                while(!fleet.isEmpty() && fleet.peek().timeToTarget <= cars.get(i).timeToTarget){
                    fleet.pop();
                }   
                fleet.push(cars.get(i));
            }
        }
        
        return fleet.size();

    }
}