package Model;

import Nodes.*;
import java.util.*;

/**
 * Intermediate Code class
 * 
 * statements and source code are analyzed 
 * and placed into different statement formats
 * 
 * @author Melina Zikou
 */
public class IntermediateCode {
    
    String operation, jumpOperation, functionName;
    ExpressionNode expr1, expr2, resultExpr;
    boolean condition;
    int label;

    public static HashSet<Integer> usedLabels = new HashSet<Integer>();
    public static HashMap<Integer, Integer> aliasLabels = new HashMap<Integer, Integer>();
    public static HashSet<Integer> createdLabels = new HashSet<Integer>();

    public IntermediateCode(){

    }
    
    //constructors for each statement / operation 
    public IntermediateCode (String operation, ExpressionNode expr1, ExpressionNode expr2, ExpressionNode resultExpr){
        this.operation = operation;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.resultExpr = resultExpr;
    }

    public IntermediateCode (String operation, ExpressionNode expr1, ExpressionNode resultExpr){
        this.operation = operation;
        this.expr1 = expr1;
        this.resultExpr = resultExpr;
    }

    public IntermediateCode (int label){
        this.operation = "label";
        this.label = label;
    }

    public IntermediateCode (String jumpOperation, int label){
        this.operation = jumpOperation;
        this.label = label;
        usedLabels.add(label);
    }

    public IntermediateCode(boolean condition, String operation, ExpressionNode expr1, ExpressionNode expr2, int label){
        this.operation = operation;
        this.condition = condition;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.label = label;
        usedLabels.add(label);
    }
    
    public IntermediateCode(String functionName, ExpressionNode expr1){
        this.expr1 = expr1;
        this.functionName = functionName;
        this.operation = "call";
    }
    public IntermediateCode(ExpressionNode expr, ExpressionNode resultExpr){
        this.operation = "cast";
        this.expr1 = expr;
        this.resultExpr = resultExpr;
    }

    public void setAliasLabel(IntermediateCode aliasLabelNode) {
        aliasLabels.put(label, aliasLabelNode.label);
    }

    /**
     * print intermediate code 
     * 
     * @return String 
     */
    public String toString(){
        if(operation == "label"){
            if(usedLabels.contains(label)){
                return "L" + label + ":\n";
            }

            return "";
        }

        else if(operation == "jump"){
            return "goto L" + label + "\n";
        }
        
        else if(operation == "call"){
            return "call " + functionName + " " + expr1.toString() + "\n";
        }

        else if(operation == "cast"){
            return resultExpr.toString() + " cast " + expr1.toString() + "\n";
        }

        else if (operation !=null && expr1 != null && resultExpr != null && expr2 != null){
            return  resultExpr.toString() +
                    " = " + expr1.toString() + 
                    " " + operation.toString() + 
                    " " + expr2.toString() + 
                    "\n";
        }
        
        else if (operation != null &&  expr1 != null && resultExpr != null && expr2 == null){
            if(operation.toString() == "-"){
                return  resultExpr.toString() +
                    " = -" +
                    expr1.toString() + 
                    "\n";
            }

            return  resultExpr.toString()+ 
                    " " + operation.toString() + 
                    " " + expr1.toString() + 
                    "\n";
        }
        
        else if (resultExpr == null && expr2 != null){
            return  "if" + condition + 
                    " " + expr1.toString() + 
                    " " + operation.toString() + 
                    " " + expr2.toString() + 
                    " goto " + "L" + label + "\n";
        }

        else if (jumpOperation != null){
            return "goto L" + label + "\n";
        }

        return "Unknown IR \n";
    }
}