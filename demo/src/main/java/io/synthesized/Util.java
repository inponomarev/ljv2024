package io.synthesized;

import org.openjdk.jol.ljv.LJV;

import java.awt.*;
import java.net.URI;
import java.net.URLEncoder;

public class Util {
    public static void browse(LJV ljv, Object obj) {
        try {
            var dot = URLEncoder.encode(ljv.drawGraph(obj), "UTF8")
                    .replaceAll("\\+", "%20");
            Desktop.getDesktop()
                    .browse(
                            new URI("https://dreampuf.github.io/GraphvizOnline/#"
                                    + dot));
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
