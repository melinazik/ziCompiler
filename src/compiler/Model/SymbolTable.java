package Model;
import java.util.*; 
import Error.*;
import Nodes.*;

public class SymbolTable {
    private Map<String,IdNode> map = new HashMap<String,IdNode>();
    private SymbolTable parent;

    public SymbolTable(){

    }

    public SymbolTable(SymbolTable parent){
        this.parent = parent;
    }

    public SymbolTable getParentSymbolTable (){
        return this.parent;
    }
    
    public IdNode get(String key){
        if(map.containsKey(key)){
            return map.get(key);
        }
        
        if(this.parent != null){
            return parent.get(key);
        }

        return null;
    }

    public void put(String key, IdNode value){
        if(map.containsKey(key)){
            ErrorHandler.getInstance().addError(String.format("Identifier '%s' already defined", key), key, value.idright, value.idleft);
        }
        else{
            map.put(key, value);
        }        
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        for (String key: map.keySet())
        {
            s.append(FormatHelper.getTypeName(map.get(key).type) + key + "\n");
            //TODO more info for the id
        }

        return s.toString();
    }
}