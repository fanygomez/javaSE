package p7;

public class OraString {
    String s;
    public boolean equals(OraString str){
        return this.s.equalsIgnoreCase(str.toString());
    }

    OraString(String s){
        this.s = s;
    }
}
