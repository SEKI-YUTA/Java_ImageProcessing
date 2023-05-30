package image_processing;

public class ColorUtil {
    public static int convertToSepiaVal(int red, int green, int blue, ColorVal color) {
        int returnVal = -1;
        switch (color) {
            case COLOR_RED:
                returnVal = (int) (0.393 * red + 0.769 * green + 0.189 * blue);
                break;
            case COLOR_GREEN:
                returnVal = (int) (0.349 * red + 0.686 * green
                        + 0.168 * blue);
                break;
            case COLOR_BLUE:
                returnVal = (int) (0.272 * red + 0.534 * green
                        + 0.131 * blue);
                break;
        }
        return returnVal;
    }
}

enum ColorVal {
    COLOR_RED,
    COLOR_GREEN,
    COLOR_BLUE
}
