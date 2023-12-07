import java.util.Objects;

public class Cat {
    private String name;
    private float size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if ((other == null) || (getClass() != other.getClass())) {
            return false;
        }

        Cat otherCat = (Cat) other;
        return name.equals(otherCat.name) && (Math.round(size * 1000) == Math.round(size * 1000));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return String.format("<Cat: name=%s, size=%.3f>", name, size);
    }
}
