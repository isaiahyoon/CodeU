class QueryStream {
    Query head;
    Query currentQuery;
    int currentQueryIndex;

    public boolean hasNext() {

    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }


    }
}