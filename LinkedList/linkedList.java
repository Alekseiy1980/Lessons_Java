import java.util.*;
import java.util.Stack;


public class linkedList {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {

//        LinkedList<Integer> ll = new LinkedList<Integer>();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//        ll.remove(1);
//        System.out.println(ll);

//        Queue<Integer>queue = new LinkedList<Integer>();
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(134);
//        queue.add(2);
//        queue.add(13);
//        System.out.println(queue);


//        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

//        PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
//        pq.add(134);
//        pq.add(2);
//        pq.add(13);
//        pq.add(1);
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());

//        Deque<Integer> deque = new ArrayDeque<Integer>();
//        Deque<Integer>dq = new ArrayDeque<Integer>();
//        dq.addFirst(6);
//        dq.addLast(2);
//        dq.addFirst(4);
//        dq.addLast(8);
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        dq.offerFirst(10);
//        System.out.println(dq);
//        dq.offerLast(5);
//        System.out.println(dq);
//        dq.pollFirst();
//        System.out.println(dq);
//        dq.pollLast();
//        System.out.println(dq);
//        dq.getFirst();
//        System.out.println(dq);
//        dq.getLast();
//        System.out.println(dq);
//        dq.pollFirst();
//        System.out.println(dq);
//        dq.pollLast();
//        System.out.println(dq);

//    Stack
//         (1+2*3*4)*(10/5) - 20
//         1 2 3 * 4 * + 10 5 / * 20 -

//  //      var exp = "20 30 - 10 *".split(" "); // (20-30)*10
//  //      var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3

//        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
//        int res = 0;
//        System.out.println(exp);
//
//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i < exp.length; i++) {
//
//            if (isDigit(exp[i])) {
//                st.push(Integer.parseInt(exp[i]));
//            } else {
//                switch (exp[i]) {
//                    case "+":
//                        res = st.pop() + st.pop();
//                        st.push(res);
//                        break;
//                    case "-":
//                        res = -st.pop() + st.pop();
//                        st.push(res);
//                        break;
//                    case "*":
//                        res = st.pop() * st.pop();
//                        st.push(res);
//                        break;
//                    case "/":
//                        res =  st.pop()/ st.pop();
//                        st.push(res);
//                        break;
//                    default:
//                        break;
//                }
//            }
//        }
//        System.out.printf("%d\n", st.pop());
    }


}
