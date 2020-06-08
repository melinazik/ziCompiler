package Nodes;

public class BoolExpressionNode extends ExpressionNode{
    ExpressionNode expr1, expr2;
    Operator operator;
    public BoolExpressionNode (ExpressionNode expr1, Operator operator, ExpressionNode expr2) {
        this.operator = operator;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public String toString () {

        String s =  expr1.toString() + " "
                    + operator.toString() + " "
                    + expr2.toString();

        return s; 
    }
}
