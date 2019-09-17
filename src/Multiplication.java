public class Multiplication extends BinaryExpression {

    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    public Expression left() {
        return this.left;
    }

    public Expression right() {
        return this.right;
    }

    public String toString(){
        return String.format("(%s * %s)", left.toString(), right.toString());
    }

    public double evaluate(){
        return left.evaluate() * right.evaluate();
    }
}
