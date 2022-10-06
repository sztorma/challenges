package challenges.interview;

public class DrawX {

    public String drawX(int n) {
        StringBuilder upBuilder = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            upBuilder.append(" ".repeat(i));
            upBuilder.append("\\");
            upBuilder.append(" ".repeat((n - i - 1) * 2));
            upBuilder.append("/");
            upBuilder.append(" ".repeat(i));
            upBuilder.append("\n");
        }
        String up = upBuilder.toString();

        String down = upBuilder.reverse().deleteCharAt(0).toString();
        // System.out.println(up.concat(down));
        return up.concat(down);
    }
}
