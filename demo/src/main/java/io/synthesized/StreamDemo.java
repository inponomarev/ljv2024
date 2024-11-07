package io.synthesized;

import org.openjdk.jol.ljv.LJV;

import java.util.List;
import java.util.stream.Stream;

import static io.synthesized.Util.openBrowser;

public class StreamDemo {

    public static void main(String[] args) {
        LJV ljv = new LJV()
                .setQualifyNestedClassNames(true)
                .setIgnoreNullValuedFields(true)
                .addFieldAttribute("sourceSpliterator", "constraint=false");

        Stream<Integer> object =
                List.of(1, 2, 3)
                        .stream()
                        .map(x -> x * x)
                        .filter(x -> x % 2 == 0);
        openBrowser(ljv, object);
    }
}
