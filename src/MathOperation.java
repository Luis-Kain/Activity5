public class MathOperation {
    float num = 0;
    float num2 = 0;

    public MathOperation(){

    }
    public MathOperation(float num, float num2) {
        this.num = num;
        this.num2 = num2;
    }

    public float addition(){
        float result  = 0;
        result = num + num2;
        return result;
    }

    public float subtraction(){
        float result = 0;
        result = num - num2;
        return result;
    }

    public float multiplication(){
        float result =  0;
        result = num * num2;
        return result;
    }

    public float division(){
        float result = 0;
        result = num / num2;
        return result;
    }

    public float module(){
        float result = 0;
        result = num % num2;
        return result;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
}
