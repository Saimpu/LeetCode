class BrowserHistory {
    ArrayList<String> li;
    int current;

    public BrowserHistory(String homepage) {
        li = new ArrayList<>();
        current = 0;
        li.add(homepage);

    }

    public void visit(String url) {
        while (li.size() > current + 1) {
            li.remove(li.size() - 1);
        }

        li.add(url);
        current++;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return li.get(current);
    }

    public String forward(int steps) {
        current = Math.min(li.size() - 1, current + steps);
        return li.get(current);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */