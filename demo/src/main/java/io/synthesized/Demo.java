package io.synthesized;

import org.openjdk.jol.ljv.LJV;

import java.util.Map;

import static io.synthesized.Util.openBrowser;

public final class Demo {
    private Demo() {
    }

    public static void main(String[] args) {
        LJV ljv = new LJV();
        Object object = immutableMap();
        openBrowser(ljv, object);
    }

    private static Object immutableMap() {
        return Map.of(1, 'a', 2, 'b');
    }


}
