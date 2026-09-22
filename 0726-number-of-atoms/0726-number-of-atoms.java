import java.util.*;

class Solution {
    public String countOfAtoms(String formula) {
        Stack<HashMap<String, Integer>> st = new Stack<>();
        st.push(new HashMap<>());

        for (int i = 0; i < formula.length(); ) {

            char ch = formula.charAt(i);
            if (ch == '(') {
                st.push(new HashMap<>());

                i++;
            }
            else if (ch == ')') {
                HashMap<String, Integer> inner = st.pop();

                i++;
                int num = 0;

                while (i < formula.length()
                        && Character.isDigit(formula.charAt(i))) {

                    num = num * 10 + (formula.charAt(i) - '0');
                    i++;
                }

                if (num == 0) {
                    num = 1;
                }

                for (Map.Entry<String, Integer> entry : inner.entrySet()) {

                    String atom = entry.getKey();
                    int count = entry.getValue() * num;

                    st.peek().put(
                        atom,
                        st.peek().getOrDefault(atom, 0) + count
                    );
                }
            }
            else {
                String atom = "";
                atom += ch;
                i++;
                while (i < formula.length()
                        && Character.isLowerCase(formula.charAt(i))) {

                    atom += formula.charAt(i);
                    i++;
                }
                int num = 0;

                while (i < formula.length()
                        && Character.isDigit(formula.charAt(i))) {

                    num = num * 10 + (formula.charAt(i) - '0');
                    i++;
                }
                if (num == 0) {
                    num = 1;
                }
                st.peek().put(
                    atom,
                    st.peek().getOrDefault(atom, 0) + num
                );
            }
        }
        HashMap<String, Integer> result = st.peek();

        List<String> atoms = new ArrayList<>(result.keySet());
        Collections.sort(atoms);

        StringBuilder ans = new StringBuilder();

        for (String atom : atoms) {

            ans.append(atom);

            int count = result.get(atom);

            if (count > 1) {
                ans.append(count);
            }
        }

        return ans.toString();
    }
}