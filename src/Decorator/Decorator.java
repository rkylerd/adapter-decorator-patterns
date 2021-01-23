package Decorator;

abstract class Decorator implements IStringSource {
    public IStringSource source;
    public Decorator(IStringSource ss) {
        this.source = ss;
    }

    @Override
    public String next() {
        return source.next();
    }

}
