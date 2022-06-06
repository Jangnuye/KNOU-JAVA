public class Man2 {
    public int nData;
    public Man2(int nNew) {nData = nNew;}
    public boolean equals(Object obj) {
        if (obj instanceof Man2) {
            Man2 m = (Man2) obj;
            if(this.nData==m.nData) return true;
        }
        return false;
    }
}
