package bstu.it.ozheredova.basejava;
import java.util.Objects;


//TODO dfghj
public class WrapperString {
    public String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WrapperString)) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(str, that.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "str='" + str + '\'' +
                '}';
    }

    public WrapperString() {
    }
    public void replace(char oldchar, char newchar)
    {
        str = str.replace(oldchar, newchar);
    }
}

