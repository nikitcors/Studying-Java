package lvl16.hw.N11;
import lvl16.hw.N11.common.*;

public class ImageReaderFactory {
    public static ImageReader getObjectTypes(ImageTypes currentTypes) throws Exception {
        if (currentTypes.equals(ImageTypes.BMP)){ return new BmpReader();}
        if (currentTypes.equals(ImageTypes.JPG)){return new JpgReader();}
        if (currentTypes.equals(ImageTypes.PNG)){return new PngReader();}
        throw new IllegalArgumentException("Вы указали не верный тип");

    }
}
