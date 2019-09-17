public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression){
        this.expression = expression;
    }

    public Expression getExpression(){
        return expression;
    }

    public void setExpression(Expression expression){
        this.expression = expression;
    }

    public String toString(){
        return String.format("(%s) ^ 2", expression.toString());
    }

    public double evaluate(){
        return expression.evaluate() * expression.evaluate();
    }
}
