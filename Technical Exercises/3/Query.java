import java.lang.Date;

class Query {
    String[] splitQuery;
    Timestamp time;

    public Query(String query) {
        query = query.split("\\s+");
        time = new Timestamp(Date.getTime());
    }

    public String getQuery() {
        return query;
    }

    public int getQueryLength() {
        return splitQuery.length;
    }

    public Timestamp getTimestamp() {
        return time;
    }

}