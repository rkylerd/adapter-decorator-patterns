package Decorator;

public class ReverseDecorator extends Decorator {

    public ReverseDecorator(IStringSource ss) {
        super(ss);
    }

    public String next() {
        String s = source.next();
        return reverse(s);
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for ( int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
