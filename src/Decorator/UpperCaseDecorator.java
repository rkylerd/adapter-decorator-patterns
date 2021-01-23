package Decorator;

public class UpperCaseDecorator extends Decorator {
    public UpperCaseDecorator(IStringSource ss) {
        super(ss);
    }

    public String next() {
        String s = source.next();
        return UpperCase(s);
    }

    public String UpperCase(String s) {
        return s.toUpperCase();
    }
}
