package example;

import java.util.EnumMap;
import java.util.Map;

public class TreeImageFactory {

    private static final Map<TreeType, TreeImage> images = new EnumMap<>(TreeType.class);

    public static TreeImage getTreeImage(TreeType type) {
        TreeImage image = images.get(type);
        if (image == null) {
            image = switch (type) {
                case SUMMER -> new TreeImage("birch_summer.png", "Leafy birch tree");
                case WINTER -> new TreeImage("birch_winter.png", "Leafy birch tree");
            };
            images.put(type, image);
        }
        return image;
    }


}
