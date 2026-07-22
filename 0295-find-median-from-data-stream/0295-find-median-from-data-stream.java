import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> mn = new PriorityQueue<>();

    PriorityQueue<Integer> mx = new PriorityQueue<>((a, b) -> {
        if (a > b) return -1;
        if (a < b) return 1;
        return 0;
    });

    public MedianFinder() {

    }

    public void addNum(int num) {

        if (mx.isEmpty()) {
            mx.add(num);
            return;
        }

        if (num >= mx.peek()) {

            if (mx.size() == mn.size()) {
                mn.add(num);
                mx.add(mn.poll());
            } else {
                mn.add(num);
            }

        } else {

            if (mx.size() != mn.size()) {
                mx.add(num);
                mn.add(mx.poll());
            } else {
                // FIXED
                mx.add(num);
            }
        }
    }

    public double findMedian() {

        if (mx.size() == mn.size()) {
            return (mx.peek() + mn.peek()) / 2.0;
        }

        return (double) mx.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */