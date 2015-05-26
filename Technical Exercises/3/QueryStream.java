class QueryStream {
    Query head;
    Query currentQuery;
    int currentQueryIndex;
    int currentQueryStreamIndex;
    int size;
    boolean newQuery = false;

    public boolean hasNext() {
        return (currentQueryIndex + 1 < currentQuery.getQueryLength()) || 
               (currentQueryStreamIndex + 1 < size);
    }

    public String next() {
        if (hasNext()) {
            if (newQuery) {
                newQuery = !newQuery
                return "<NEWQUERY>";
            }
            newQuery = !newQuery;
            if (currentQueryIndex + 1 < currentQuery.getQueryLength()) {
                String temp = currentQuery.getValueAtIndex(currentQueryIndex);
                currentQueryIndex++;
                return temp;
            } else {
                // move to next query
                currentQuery = currentQuery.next();
                currentQueryStreamIndex++;
                currentQueryIndex = 0;
                return currentQuery.getValueAtIndex(currentQueryIndex);
            }
        }
        return null;
    }
}