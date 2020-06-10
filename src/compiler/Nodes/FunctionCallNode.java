package Nodes;

public class FunctionCallNode extends StatementNode{
    public String id;
    public ExpressionNode argument;
    public FunctionCallNode (String id, ExpressionNode argument){
        this.id = id;
        this.argument = argument;
    }

    public String toString () {
        return id + " (" + argument.toString() + ");"; 
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}