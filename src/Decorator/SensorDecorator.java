package Decorator;

public class SensorDecorator extends Decorator {
    public SensorDecorator(IStringSource ss) {
        super(ss);
    }

    public String next() {
        String s = source.next();
        return censor(s);
    }

    public String censor(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {

                sb.append("*");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
