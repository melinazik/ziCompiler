package Nodes;

public class ProgramNode extends Node{
    
    public String id;
    public StatementListNode compStmt;

    public ProgramNode (String id, StatementListNode compStmt) {
        this.id = id;
        this.compStmt = compStmt;
    }

    public String toString () {
        StringBuilder s = new StringBuilder();
        s.append("mainclass " + id + " { \n");
        NodeFormatter.getInstance().incDepth();
        s.append(NodeFormatter.getInstance().getSpaces());
        s.append("public static void main () {\n");

        s.append(compStmt.toString());
        s.append(NodeFormatter.getInstance().getSpaces());

        s.append("}\n");
        NodeFormatter.getInstance().decDepth();
        s.append(NodeFormatter.getInstance().getSpaces());

        s.append("}\n");
        NodeFormatter.getInstance().decDepth();
        

        return s.toString();
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}