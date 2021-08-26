package SortingHatHogwarts;

import java.util.Objects;

public class Quality {
    private Object value;
    private String name;

    public Quality(Object value, String name) {
        this.value = value;
        this.name = name;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quality quality = (Quality) o;
        return Objects.equals(name, quality.name);
    }

}
