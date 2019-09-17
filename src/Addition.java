public class Addition extends BinaryExpression {

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    public String toString(){
        return String.format("(%s + %s)", left.toString(), right.toString());
    }

    public double evaluate(){
        return left.evaluate() + right.evaluate();
    }
}