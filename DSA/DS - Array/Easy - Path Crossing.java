import java.util.HashSet;
import java.util.Objects;

class Solution {

    public boolean isPathCrossing(String path) {
        int length = path.length();
        HashSet<Coordinates> coordinatesSet = new HashSet<>();
        Coordinates current = new Coordinates(0, 0);
        for (int i = 0; i < length; i++) {
            coordinatesSet.add(current);

            switch (path.charAt(i)) {
                case 'E':
                    current.setX(current.getX()+1);
                break;

                case 'W':
                    current.setX(current.getX()-1);
                break;

                case 'N':
                    current.setY(current.getY()+1);
                break;

                case 'S':
                    current.setY(current.getY()-1);
                break;

                default:
                    break;
            }

            if (coordinatesSet.contains(current)) {
                return true;
            }
        }

        return false;
    }
}

class Coordinates{
    int x;
    int y;
    
    Coordinates(int a, int b){
        x = a;
        y = b;
    }

    public void setX(int a){
        x = a;
    }
    public void setY(int b){
        y = b;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


}