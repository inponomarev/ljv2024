package io.synthesized;

import org.openjdk.jol.ljv.LJV;

import java.util.Map;

import static io.synthesized.Util.browse;

public final class Demo {
    private Demo() {
    }

    public static void main(String[] args) {
        browse(new LJV(), immutableMap());
    }

    private static Object immutableMap() {
        return Map.of(1, 'a', 2, 'b');
    }


}
