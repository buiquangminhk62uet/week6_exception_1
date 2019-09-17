public class Division extends BinaryExpression {

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    public String toString(){
        return String.format("(%s / %s)", left.toString(), right.toString());
    }

    public double evaluate() {
//        try{
//            return left.evaluate() / right.evaluate();
//        }catch (ArithmeticException e){
//            System.out.print("Lỗi chia hết cho 0");
//            return e.hashCode();
//        }
        if (right.evaluate() <= 0.001 && right.evaluate() >= 0 || right.evaluate() <= -0.001 && right.evaluate() <= 0){
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / right.evaluate();
    }
}
