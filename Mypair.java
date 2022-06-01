class Mypair implements Pair <String, Integer> {
    private String key;
    private Integer value;

    public Mypair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {return key;}
    public Integer getValue() {return value;}
}
