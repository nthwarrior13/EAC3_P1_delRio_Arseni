package arsenidelrio.ioc.cat.eac3_p1_delrio_arseni.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ContingutLlibres {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Llibre> ITEMS = new ArrayList<Llibre>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Llibre> ITEM_MAP = new HashMap<String, Llibre>();

    private static final int COUNT = 7;

    public static class Llibre {
        public final String id;
        public final String content;
        public final String details;

        public Llibre(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }


    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createLlibre(i));
        }
    }

    private static void addItem(Llibre item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static Llibre createLlibre(int position) {
        String newTitle;
        String newDetail;
        switch (position) {
            case 1:
                newTitle = "Origen";
                newDetail = "Lorem ipsum dolor sit amet,\n" +
                        "        consectetur adipiscing elit. Praesent ultrices congue rutrum.\n" +
                        "        Phasellus elementum ipsum ac convallis aliquam. Suspendisse eleifend\n" +
                        "        eros a enim faucibus mollis. Nunc placerat, est vitae vestibulum\n" +
                        "        blandit, dolor diam fringilla tellus, eu euismod mauris neque\n" +
                        "        at neque";
                break;
            case 2:
                newTitle = "Inferno";
                newDetail = "Lorem ipsum dolor sit amet,\n" +
                        "        consectetur adipiscing elit. Praesent ultrices congue rutrum.\n" +
                        "        Phasellus elementum ipsum ac convallis aliquam. Suspendisse eleifend\n" +
                        "        eros a enim faucibus mollis. Nunc placerat, est vitae vestibulum\n" +
                        "        blandit, dolor diam fringilla tellus, eu euismod mauris neque\n" +
                        "        at neque";
                break;
            case 3:
                newTitle = "El código Da Vinci";
                newDetail = "Lorem ipsum dolor sit amet,\n" +
                        "        consectetur adipiscing elit. Praesent ultrices congue rutrum.\n" +
                        "        Phasellus elementum ipsum ac convallis aliquam. Suspendisse eleifend\n" +
                        "        eros a enim faucibus mollis. Nunc placerat, est vitae vestibulum\n" +
                        "        blandit, dolor diam fringilla tellus, eu euismod mauris neque\n" +
                        "        at neque";
                break;
            case 4:
                newTitle = "Ángeles y demonios";
                newDetail =  "Lorem ipsum dolor sit amet,\n" +
                        "        consectetur adipiscing elit. Praesent ultrices congue rutrum.\n" +
                        "        Phasellus elementum ipsum ac convallis aliquam. Suspendisse eleifend\n" +
                        "        eros a enim faucibus mollis. Nunc placerat, est vitae vestibulum\n" +
                        "        blandit, dolor diam fringilla tellus, eu euismod mauris neque\n" +
                        "        at neque";
                break;
            case 5:
                newTitle = "El símbolo perdido";
                newDetail =  "Lorem ipsum dolor sit amet,\n" +
                        "        consectetur adipiscing elit. Praesent ultrices congue rutrum.\n" +
                        "        Phasellus elementum ipsum ac convallis aliquam. Suspendisse eleifend\n" +
                        "        eros a enim faucibus mollis. Nunc placerat, est vitae vestibulum\n" +
                        "        blandit, dolor diam fringilla tellus, eu euismod mauris neque\n" +
                        "        at neque";
                break;
            case 6:
                newTitle = "La conspiración";
                newDetail =  "Lorem ipsum dolor sit amet,\n" +
                        "        consectetur adipiscing elit. Praesent ultrices congue rutrum.\n" +
                        "        Phasellus elementum ipsum ac convallis aliquam. Suspendisse eleifend\n" +
                        "        eros a enim faucibus mollis. Nunc placerat, est vitae vestibulum\n" +
                        "        blandit, dolor diam fringilla tellus, eu euismod mauris neque\n" +
                        "        at neque";
                break;
            default:
                newTitle = "Fortaleza digital";
                newDetail = "Lorem ipsum dolor sit amet,\n" +
                        "        consectetur adipiscing elit. Praesent ultrices congue rutrum.\n" +
                        "        Phasellus elementum ipsum ac convallis aliquam. Suspendisse eleifend\n" +
                        "        eros a enim faucibus mollis. Nunc placerat, est vitae vestibulum\n" +
                        "        blandit, dolor diam fringilla tellus, eu euismod mauris neque\n" +
                        "        at neque";
                break;
        }
        return new Llibre(String.valueOf(position),newTitle, newDetail);
        //return new Llibre(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */

}
