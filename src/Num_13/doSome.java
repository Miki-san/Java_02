package Num_13;

public class doSome {
    public double count;

    public doSome() {
        this.count = 30;
    }

    public double doSomethingWithCount(double i) throws IncorrectNumException {
        if(i == 1){
            throw new IncorrectNumException();
        }
        this.count *= Math.log(i);
        return this.count;
    }
}
