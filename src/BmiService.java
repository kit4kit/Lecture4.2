public class BmiService {
    public float calculate(float weight, float height){
        float index = weight / (height * height);
        return  index;
    }
}
