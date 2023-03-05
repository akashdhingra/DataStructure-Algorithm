class Solution {
    public String interpret(String command) {
        String s = command;
        if(s.contains("()")){
            s = s.replace("()","o");
        }
        
        if(s.contains("(al)")){
            s = s.replace("(al)","al");
        }
        
        return s;
        
    }
}