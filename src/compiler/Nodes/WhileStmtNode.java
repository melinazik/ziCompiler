package Nodes; 

public class WhileStmtNode extends StatementNode{
    public ExpressionNode boolExpr;
    public StatementNode stmt;

    public WhileStmtNode (ExpressionNode boolExpr, StatementNode stmt) {
        this.boolExpr = boolExpr;
        this.stmt = stmt;
    }

    public String toString () {
        StringBuilder s = new StringBuilder(); 
        
        s.append("while (" + boolExpr.toString() + ") {\n");
        s.append(stmt.toString());
        s.append(NodeFormatter.getInstance().getSpaces());
        s.append("} \n");

        return s.toString();
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}