import java.lang.Date;

class Query {
    String[] splitQuery;
    Timestamp time;

    public Query(String query) {
        query = query.split("\\s+");
        time = new Timestamp(Date.getTime());
    }

    public String getValueAtIndex(int i) {
        return splitQuery[i];
    }

    public int getQueryLength() {
        return splitQuery.length;
    }

    public Timestamp getTimestamp() {
        return time;
    }

}